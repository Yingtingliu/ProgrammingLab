package PG_CourseCode;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class LoadStudents {

	public static void main(String[] args) {
		// Create an array (assume a max of 10 students)
		Student[] students = new Student[10];
		int nStudents = 0;
		// Initialise a filereader reference
		FileReader fr = null;
		try {
			// make a filereader object
			fr = new FileReader("/Users/simon/Desktop/students.csv");
			// make a scanner around the filereader
			Scanner s = new Scanner(fr);
			// Loop until no lines left
			while(s.hasNextLine()) {
				// get the next line
				String line = s.nextLine();
				// split using the comma
				String[] tokens = line.split(",");
				// name is the first element in the array
				String name = tokens[0];
				// grade is second. But it's a string, so 
				// convert to an int
				int grade = Integer.parseInt(tokens[1]);
				// make a new student object and insert into array
				students[nStudents++] = new Student(name,grade);
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			// close the file, if it's open
			if(fr!=null) {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		// If we loaded any students, print them
		if(nStudents>0) {
			for(int i=0;i<nStudents;i++) {
				System.out.println(students[i]);
			}
		}
	}

}
