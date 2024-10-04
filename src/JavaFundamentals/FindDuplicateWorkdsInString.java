package JavaFundamentals;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateWorkdsInString {

	private static String word;

	public static void main(String[] args) {

		public static void findDuplicateWords (String inputString) {
			//split:
			
			
			String words[] = inputString.split(" ") ;
			//create one hashmap:
			Map<String , Integer> wordCount = new HashMap <String , Integer>() ;
			
			// to check each word in given array:
			
			for (String word: words) {
				
			}
			if (wordCount.containsKey(word)) {
				wordCount.put(((String) word).toLowerCase( ), wordCount.get(word)+1) ;
			} else {
				
				wordCount.put(word, 1);
			
		}
		

		
		
		// extracting all the keys of map - wordCount
		Set<String> wordsInString = wordCount.keySet();
		
		// loop through all the words in wordCount;
		
		for (String word : wordsInString ) {
			if (wordCount.get(word)>1 ) {
				
				System.out.println(word + "..." +wordCount.get(word));
			}
		}
		

	

}



}










