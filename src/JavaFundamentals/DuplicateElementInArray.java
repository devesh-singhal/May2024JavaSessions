package JavaFundamentals;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElementInArray {

	public static void main(String[] args) {
	
		String names[] =  {"Java", "python", "Ruby", "C", "C++" , "JavaScript" , "Java", "C++"  } ;
		
		//1. TIme complexity :: O (nxn)  O(n^2)
		for ( int i =0; i<names.length; i++  ) {
			for ( int j= i+1; j<names.length ; j++) {
				
				if (names[i].equals(names [j])) {
					System.out.println("duplicate element is " +names[i]);
				}
			}
		}
		
		
		// 2. Using HashSet : java collection it stores unique values
		// Time complexity will be O (n)
		
		Set <String> store = new HashSet <String> ();
		for ( String name : names ) {
			if (store.add(name) == false) {
				System.out.println("duplicate element found " +name);
			}
			
		}
		
		
		
		//3. Using HashMap :
		
		
		
  Map <String , Integer> storeMap = new HashMap<String, Integer>() ;
  for (String name : names) {
	  Integer count = storeMap.get(name) ;
	  if (count == null) {
		  storeMap.put(name, 1) ;
		  
	  } else {
		  storeMap.put(name, ++count);
	  }
  }
		
		// get the values for HashMap:
  
	Set <Entry<String , Integer>> entrySet = storeMap.entrySet();
		for (Entry<String , Integer> entry: entrySet)  {
			if (entry.getValue()>1) {
				System.out.println("Duplicate value is "  +entry.getKey());
			}
		}
		
		
		
		
		
	
		
		
	}

}
