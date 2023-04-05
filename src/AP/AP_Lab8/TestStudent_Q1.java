package AP.AP_Lab8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * Separate read file and write file methods
 */

public class TestStudent_Q1 {
	
	public final String readFilepath ="D:\\Glasgow study\\Semester 2\\Adv programming\\students_read.csv";
	public final String writeFilepath ="D:\\Glasgow study\\Semester 2\\Adv programming\\students_read.csv";

	public static void main(String[] args) {
		
		TestStudent_Q1 testStudentMain = new TestStudent_Q1();
		
		testStudentMain.csvReader();

	}
	
	// this is the writer
	public void csvWriter() {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(readFilepath))) {
			Student[] students = new Student().generate();
			StringBuilder sb = new StringBuilder();
			
			for (Student student : students) {
				sb.append(student.getRollNumber()).append(",");
				sb.append(student.getName()).append(",");
				sb.append(student.getAge()).append(",");
				sb.append(student.getGrade()).append("\n");
			}
			
			bw.write(sb.toString());
			
			System.out.println("CSV file has been created!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// this is the reader
	public void csvReader() {
		try (BufferedReader br = new BufferedReader(new FileReader(writeFilepath))) {

			Scanner myReader = new Scanner(br);
			Student[] students = new Student[10000];
			int i = 0;
			
			while (myReader.hasNextLine()) {
				
				Student student = new Student();
				String data = myReader.nextLine();
				String[] parts = data.split(",");
				int rollNum = Integer.valueOf(parts[0]);
				short age = Short.valueOf(parts[2]);
				float grade = Float.valueOf(parts[3]);
				
				student.setRollNumber(rollNum);
				student.setName(parts[1]);
				student.setAge(age);
				student.setGrade(grade);
				students[i] = student;
				i++;
				
			}
			
			// Print out the content of the file read
	        for (int j = 0; j < i; j++) {
	            System.out.println(students[j].toString());
	        }
			
			System.out.println("CSV file has been read!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
