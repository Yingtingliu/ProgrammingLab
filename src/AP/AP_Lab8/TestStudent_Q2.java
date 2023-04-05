package AP.AP_Lab8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class TestStudent_Q2 {
	
	
	public static void main(String[] args) {
		
		TestStudent_Q2 testStudentMain = new TestStudent_Q2();
		
//		testStudentMain.csvReader();

	}
	
	public final String readFilepath ="D:\\Glasgow study\\Semester 2\\Adv programming\\students_read.csv";
	public final String writeFilepath ="D:\\Glasgow study\\Semester 2\\Adv programming\\students_write.csv";
	public final int studentNum = 10;
	
	
	public void readAndWriteFile() {		
		
		try (	// reader
				FileInputStream fis = new FileInputStream(readFilepath);
				ObjectInputStream ois = new ObjectInputStream(fis);
				// writer
				FileOutputStream fos = new FileOutputStream(writeFilepath);
				ObjectOutputStream oos = new ObjectOutputStream(fos); 
				) {
			
			/*
			 * Start reader methods
			 * Use scanner read data
			 */			
			Scanner myReader = new Scanner(ois);
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
			 * Use ObjectOutputStream to write data
			 */			
			for (Student student : students) {
			
				// !!! Using ObjectOutputStream to write object !!!
				oos.writeObject(student);
				
			}
			
			// write UTF is a way of writing string
//			oos.writeUTF(sb.toString());
			
			
			System.out.println("CSV file has been read!");
		} catch (IOException e) {
			e.printStackTrace();
		}
			
		
	}

}
