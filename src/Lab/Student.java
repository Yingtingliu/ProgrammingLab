package Lab;

public class Student extends People {
	double Gpa;

	public Student() {
		super();		
	}
	
	public Student(double gpa) {
		super();
		Gpa = gpa;
	}

	public double getGpa() {
		return Gpa;
	}

	public void setGpa(double gpa) {
		Gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student [Gpa=" + Gpa + "]";
	}		
	
	
}
