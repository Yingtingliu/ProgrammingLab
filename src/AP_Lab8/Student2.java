package AP_Lab8;

import java.util.Random;

public class Student2 {	
	
	int rollNumber;
	String name;
	short age;
	float grade;
	
	public Student2() {}
	
	public Student2(int rollNumber, String name, short age, float grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
	
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public short getAge() {
		return age;
	}
	public void setAge(short age) {
		this.age = age;
	}
	public float getGrade() {
		return grade;
	}
	public void setGrade(float grade) {
		this.grade = grade;
	}	
	
	public Student2[] generate() {
        final int studentNum = 10000;
        final int min = 10; // Minimum value of range
        final int max = 100; // Maximum value of range
        String alphaStr = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvxyz";

        Student2[] students = new Student2[studentNum];

        for (int i = 0; i < studentNum; i++) {
            Random random = new Random();
            String randomName = String.valueOf(alphaStr.charAt(random.nextInt(alphaStr.length())));
            short age = (short) Math.floor(Math.random() * (max - min + 1) + min);
            float grade = (float) Math.floor(Math.random() * (max - min + 1) + min);

            Student2 student = new Student2(i, randomName, age, grade);

            students[i] = student;
        }

        return students;
    }

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", age=" + age + ", grade=" + grade + "]";
	}
	
	
	
}
