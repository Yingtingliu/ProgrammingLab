package DSA_Excercise1;
import java.util.ArrayList;
import java.util.List;


public class ListingWords {

	/**
	 * @param args
	 */
	
	
	static List<String> scan (String line) {
		String[] wordArray =line.split("[[^A-Z]&&[^a-z]]+"); 
		List<String> wordList =new ArrayList<String>();
		for (String word : wordArray) 
			wordList.add(word);
		return wordList;}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Listing words
		List<String> words = scan("To be, or not to be");
		for (String w : words)
			System.out.println(w);

	}

}
