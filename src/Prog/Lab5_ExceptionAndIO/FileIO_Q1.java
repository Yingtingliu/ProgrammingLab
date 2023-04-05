package Prog.Lab5_ExceptionAndIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import week5_Exceptions_FileIO.Student;

public class FileIO_Q1 {

	public static void main(String[] args) {
		
		FileReader fr = null;
		//using char because we use .read()
		char[] s = new char[1000];
		try {
			String fN = "C:/Users/2817385l/Downloads/dolphin.txt";
			fr = new FileReader(fN);
			
			//printing out
			try {
				fr.read(s);
			} catch (IOException e) {				
				e.printStackTrace();
			}
			System.out.println(s);
			
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
