package week5_Exceptions_FileIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class FR4 {
	public static void main(String[] args) throws FileNotFoundException, IOException{
		String fN = "/Users/simon/Desktop/students.csv";
		FileReader fr = new FileReader(fN);
		// some reading
		fr.close();
	}
}
