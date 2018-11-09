package DataStructures.JavaSort;

import java.util.*;

class Student {
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
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
public class Solution
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());

		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();

			Student st = new Student(id, fname, cgpa);
			studentList.add(st);

			testCases--;
		}

//        studentList.sort((s1, s2) -> Integer.compare(s1.getId(), s2.getId()));
//        studentList.sort((s1, s2) -> s1.getFname().compareTo(s2.getFname()));
//        studentList.sort((s1, s2) -> (int) -(s1.getCgpa()*1000 - s2.getCgpa()*1000));


        studentList.sort(Comparator.comparingDouble(Student::getCgpa).reversed()
                .thenComparing(Student::getFname)
                .thenComparingInt(Student::getId));

      	for(Student st: studentList){
			System.out.println(st.getFname());
		}
	}
}



