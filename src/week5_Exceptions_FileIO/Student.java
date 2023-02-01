package week5_Exceptions_FileIO;


public class Student implements Comparable<Student> {
	private int grade;
	private String name;
	public Student(String n,int g) {
		name = n;
		grade = g;
	}
	public String getName() {
		return name;
	}
	public String toString() {
		return name + " " + grade;
	}
	public int getGrade() {
		return grade;
	}
	public int compareTo(Student o) {
		if(getGrade() > o.getGrade()) {
			return 1;
		}else if(getGrade() < o.getGrade()) {
			return -1;
		}else {
			return 0;
		}
	}
}
