package Prog.PG_CourseCode;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
public class ChoosingFiles {
	public static void main(String[] args) {
		// Make a file chooser
		JFileChooser fc = new JFileChooser();
		/*
		 *  show the open dialog
		 *  note that the new JFrame is a Parent
		 *  container. Normally this would be 
		 *  some other GUI window
		 *  but we don't have any others so
		 *  we can use a blank JFrame.
		 *  If you like, you can also use null, but, 
		 *  on a mac, this can cause problems!
		 *  
		 *  This way, you'll notice that the program
		 *  keeps running indefinitely. That's because
		 *  of the JFrame.
		 */
		
		int returnVal = fc.showOpenDialog(new JFrame());
		
		
		/*
		 * it returns 0 if a file has been chosen
		 */
		System.out.println(returnVal);
		/*
		 * can also compare to int constants in
		 * the JFileChooser class which is a bit
		 * clearer than 0 or 1
		 */
		if(returnVal == JFileChooser.APPROVE_OPTION) {
			FileReader fr = null;
			try {
				/* 
				 * getSelectedFile() returns a File
				 * object. Fortunately, FileReader
				 * is happy to accept this.
				 */
				fr = new FileReader(fc.getSelectedFile());
				/* 
				 * all normal from here...
				 */
				Scanner s = new Scanner(fr);
				while(s.hasNextLine()) {
					String line = s.nextLine();
					System.out.println(line);
				}
			}catch(FileNotFoundException e) {
				e.printStackTrace();
			}finally {
				if(fr != null) {
					try {
						fr.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

}
