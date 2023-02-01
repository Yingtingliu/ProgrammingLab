package week5_Exceptions_FileIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
public class FR {
	public static void main(String[] args) {
		try {
			String fN = "/Users/simon/Desktop/students.csv";
			FileReader fr = new FileReader(fN);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
