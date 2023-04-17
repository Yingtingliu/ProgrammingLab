package Prog.Lab5_ExceptionAndIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import Prog.week5_Exceptions_FileIO.Student;

public class FileIO_Q2 {
	
	public static void main(String[] args) {
	
		char[] ch = new char[1000];
		int lineCount = 0;
		int result = 0;
		FileReader fr = null;
		
		
		try {
			String fN = "C:/Users/2817385l/Downloads/sums.txt";
			fr = new FileReader(fN);
			Scanner s = new Scanner(fr);
			while(s.hasNextLine()) {
				// get the next line
				String line = s.nextLine();
				// split using the comma
				String[] tokens = line.split("\\s+");
//				System.out.println(tokens[0]);
				// name is the first element in the array
				int firstNum = Integer.parseInt(tokens[0]);
				String opperator = tokens[1];
				int secNum = Integer.parseInt(tokens[2]);
				
				
				if(opperator.equals("+")){
					result = firstNum+secNum;
					System.out.println(firstNum+ "+"+ secNum + "=" +  result);
				} else if(opperator.equals("-")){
					result = firstNum-secNum;
					System.out.println(firstNum+ "-"+ secNum + "=" +  result);
			}
					
			
		}
		
		
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				fr.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
