package CourseCode.FileIO;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class _InputOutput {

	public static void main(String[] args) {
		
		
		FileReader fr = null;
		Student[] students = new Student[10];
		int i = 0;
		try {
			String fN = "C:\\Users\\Alisha\\Desktop\\student1.txt";
			fr = new FileReader(fN);
			// read file
			Scanner scanner = new Scanner(System.in);
			while(scanner.hasNextLine()) {
				String line = scanner.nextLine();
				String[] tokens = line.split(",");
				System.out.println(tokens[0]);
				int grade = Integer.parseInt(tokens[1]);
				students[i++] = new Student(tokens[0], grade);
				System.out.println("Integer Grade: " + grade);
			}
			
			fr.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
		


	

}
