package Lab5_ExceptionAndIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileIO_Q3 {

	public static void main(String[] args) {
		
		FileReader fr = null;
		char[] s = new char[1000];
		char[] s1 = new char[1000];
		try {
			String fN = "C:/Users/2817385l/Downloads/backwards.txt";
			String fOUT = "C:/Users/2817385l/Downloads/forwards.txt";
			fr = new FileReader(fN);
			int i =0;
			try {
				
				int c = 0;             
			    while((c = fr.read()) != -1)         	//Read char by Char
			    {
			       char character = (char) c;          //converting integer to char
			       System.out.print(character);        //Display the Character
			    }
//			    int i = name.length();
//			    while (i > 0){
//			        char character = c.charAt(i);
//			        System.out.print(character);
//			        i--;
//			    }
			      
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
//			Scanner scanner = new Scanner(fr);
//							
//			while (scanner.hasNextInt()) {
//				s[i] = (char) scanner.nextInt();
//				i++;
//			}
//			System.out.println(s);
			try {
				FileWriter fw = new FileWriter(fOUT);
				fw.write(s1);
				fw.close();
				System.out.println("OK");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
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
