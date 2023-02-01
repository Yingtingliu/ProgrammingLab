package CourseCode.FileIO;

import java.io.FileReader;
import java.io.IOException;
public class FR3 {
	public static void main(String[] args) {
		FileReader fr = null;
		try {
			String fN = "/Users/simon/Desktop/students.csv";
			fr = new FileReader(fN);
			// read file
			fr.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
