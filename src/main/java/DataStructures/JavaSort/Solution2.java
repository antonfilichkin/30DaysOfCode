package DataStructures.JavaSort;

import java.util.*;

class Student2{
    private int id;
    private String fname;
    private double cgpa;
    public Student2(int id, String fname, double cgpa) {
        super();
        this.id = id;        // 3 inc
        this.fname = fname;  // 2 alph
        this.cgpa = cgpa;    // 1 dec
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}

//Complete the code
public class Solution2
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student2> studentList = new ArrayList<Student2>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student2 st = new Student2(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        Comparator<Student2> comparator = (s1, s2) -> {
            if (s1.getCgpa() == s2.getCgpa()){
                if (s1.getFname().equals(s2.getFname())){
                    return Integer.compare(s1.getId(), s2.getId());
                }
                return s1.getFname().compareTo(s2.getFname());
            }
            return Double.compare(s1.getCgpa(), s2.getCgpa());
        };

        studentList.sort(comparator);

        for(Student2 st: studentList){
            System.out.println(st.getFname());
        }
    }
}
