package JavaFundamentals;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {

	// function reverses the elements of the array 
    //static void reverse(Integer a[]) 
    //{ 
//        Collections.reverse(Arrays.asList(a)); 
//        System.out.println(Arrays.asList(a)); 
//    } 
//  
//    public static void main(String[] args) 
//    { 
//        Integer [] arr = {10, 20, 30, 40, 50, 100000}; 
//        reverse(arr); 
//		
//	}
//
//}


// By String Builder
    	public static void main(String[] args) {
    	 String[] arr = {"HelloDEFESHHASDHSHFHFHFDHFDHDFH", "World"}; 
         StringBuilder reversed = new StringBuilder(); 
     
         for (int i = arr.length; i > 0; i--) { 
             reversed.append(arr[i - 1]).append(" "); 
         }; 
           
         String[] reversedArray = reversed.toString().split(" "); 
           
         System.out.println(Arrays.toString(reversedArray)); 
       } 
   }

