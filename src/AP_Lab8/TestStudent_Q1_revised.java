package AP_Lab8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestStudent_Q1_revised {
	
	
	public static void main(String[] args) {
		
		TestStudent_Q1_revised testStudentMain = new TestStudent_Q1_revised();
		
//		testStudentMain.csvReader();

	}
	
	public final String readFilepath ="D:\\Glasgow study\\Semester 2\\Adv programming\\students_read.csv";
	public final String writeFilepath ="D:\\Glasgow study\\Semester 2\\Adv programming\\students_write.csv";
	public final int studentNum = 10000;
	
	
	public void readAndWriteFile() {
		
		// adding reader and writer buffer 
		try (	BufferedReader br = new BufferedReader(new FileReader(writeFilepath));
				BufferedWriter bw = new BufferedWriter(new FileWriter(readFilepath));			 
				) {
			
			/*
			 * Start reader methods
			 * Use scanner read data
			 */			
			Scanner myReader = new Scanner(br);
			Student[] students = new Student[studentNum];
			int i = 0; // flag
			
			// iterate through all lines
			while (myReader.hasNextLine()) {
				
				Student student = new Student();
				String data = myReader.nextLine();
				// parse data
				String[] parts = data.split(",");
				// parse data and cast to correct type
				int rollNum = Integer.valueOf(parts[0]);
				short age = Short.valueOf(parts[2]);
				float grade = Float.valueOf(parts[3]);
				
				// set variables
				student.setRollNumber(rollNum);
				student.setName(parts[1]);
				student.setAge(age);
				student.setGrade(grade);
				students[i] = student;
				i++; // flag added
				
			}
			
			
			/*
			 * Start writer methods
			 * Use string builder to write data
			 */
			StringBuilder sb = new StringBuilder();
			
			// append data
			for (Student student : students) {
				sb.append(student.getRollNumber()).append(",");
				sb.append(student.getName()).append(",");
				sb.append(student.getAge()).append(",");
				sb.append(student.getGrade()).append("\n");
			}
			
			// buffer writer to write out
			bw.write(sb.toString());
			
			System.out.println("CSV file has been read!");
		} catch (IOException e) {
			e.printStackTrace();
		}
			
		
	}

}
