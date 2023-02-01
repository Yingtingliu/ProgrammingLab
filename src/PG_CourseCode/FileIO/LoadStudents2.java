package PG_CourseCode.FileIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class LoadStudents2 {

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
			// Sort them
			/* 
			 * note the extra arguments to sort
			 * which are the start and stop position
			 * in which to sort. If we try and sort
			 * the whole thing, we'll get errors because
			 * positions in the array after the last
			 * student are empty. 
			 */
			Arrays.sort(students,0,nStudents);
			// Decide where to store the output
			String outF = "/Users/simon/Desktop/out.csv";
			// Create a FileWriter reference
			FileWriter fw = null;
			try {
				// Create a FileWriter object
				fw = new FileWriter(outF);
				// Loop over the students
				for(int i=0;i<nStudents;i++) {
					/*
					 * Construct a string for the line
					 * Note the newline character at the end
					 */
					String newLine = 
							students[i].getName() + "," + 
							students[i].getGrade() + "\n";
					// write the line to the file
					fw.write(newLine);
				}
			}catch(IOException e) {
				e.printStackTrace();
			}finally {
				// Attempt to close the file
				if(fw!=null) {
					try {
						fw.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

}
