package PG_CourseCode;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class FR2 {
	public static void main(String[] args) {
		FileReader fr = null;
		try {
			String fN = "/Users/simon/Desktop/students.csv";
			fr = new FileReader(fN);
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fr.close();
			}catch(Throwable e) {
				e.printStackTrace();
			}
		}
	}
}
