package DataStructures.JavaPriorityQueue;

import java.util.*;

class Student{
    int id;
    String name;
    double cgpa;

    public Student(String name, double cgpa, int id) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }

}

class Priorities {
    public List<Student> getStudents(List<String> events) {

        Comparator comparator = new StudentsComparator();
        PriorityQueue<Student> priorityQueue = new PriorityQueue<Student>(comparator);

        for (String event : events) {
            if (event.startsWith("ENTER")) {
                String[] input = event.split(" ");
                priorityQueue.add(new Student(input[1], Double.valueOf(input[2]), Integer.valueOf(input[3])));
            } else if (event.startsWith("SERVED")) {
                priorityQueue.poll();
            }
        }

        List<Student> studentsWaiting = new ArrayList<>();
        while (!priorityQueue.isEmpty()){
            studentsWaiting.add(priorityQueue.poll());
        }
        return studentsWaiting;

//        return new ArrayList<>(priorityQueue);

    }

    class StudentsComparator implements Comparator<Student>{

        public int compare(Student s1, Student s2){
            if (s1.cgpa == s2.cgpa){
                if (s1.name.equals(s2.name)){
                    return Integer.compare(s1.id, s2.id);
                }
                return s1.name.compareTo(s2.name);
            }
            return -Double.compare(s1.cgpa, s2.cgpa);
        }
    }

}

public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}