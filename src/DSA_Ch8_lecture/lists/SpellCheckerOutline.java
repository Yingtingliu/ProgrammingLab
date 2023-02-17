package DSA_Ch8_lecture.lists;


import java.io.*;
import java.util.*;

public class SpellCheckerOutline {
	
	// declare all file names at start so they can be changed easily
	public static final String DICT_NAME = "dict2.txt";
	public static final String DOC_NAME = "doc2.txt";
	public static final String OUTPUT_NAME = "output.txt";

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Set<String> document = new TreeSet<String>();   // using a Set so we can ignore repeats
		Set<String> dictionary = new TreeSet<String>(); // ditto, but probably not necessary (List would do)
		String result = "";

		// set up the scanners, and printwriter
		Scanner dictStream = null;  //so we can read from the dictionary file
		try {
			dictStream = new Scanner(new FileInputStream(DICT_NAME));
		} catch (FileNotFoundException e) {
			System.out.println("dictionary was not found");
			System.out.println("or could not be opened");
			System.exit(0);
		}

		Scanner docStream = null;  //so we can read from the document file
		//etc. 
		
		
	

		PrintWriter outputStream = null;
        // etc.
		
		
		// Now do the actual work!

		
		// read in the dictionary, and add to output
		while (dictStream.hasNext())
			dictionary.add(dictStream.next());

		for (String s : dictionary)   //FOR EACH LOOP. USES ITERATOR! 
			result += s + "\n";       // will omit additions to this from now on
		                              // leave this to you

		// read in the document, ignoring punctuation, add to output
		
		// sophisticated use of a scanner
		while (docStream.hasNextLine()) {
			String line = docStream.nextLine();
			result += line + "\n";
			Scanner lineScanner = new Scanner(line);
			lineScanner.useDelimiter("[[^A-Z]&&[^a-z]]+"); // treat as a delimiter anything that's
			//not a letter
			
			while (lineScanner.hasNext())
				document.add(lineScanner.next().toLowerCase()); // remove capitals
			lineScanner.close();
		}

		// find the set of misspelled words, add to output
		
		// iterate over document, and use contains method on dictionary
		// add misspelled words to result string
		// leaving this for you
		

		System.out.println(result);
		outputStream.println(result);
		outputStream.close();

	}

}
