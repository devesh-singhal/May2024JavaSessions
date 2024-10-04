package JavaFundamentals;

import java.util.Arrays;

public class ShiftZerosztoRight {

	private static int[] ShiftZeroToRight (int [] a) {
		
		if (a.length ==1) {
		return a;
		
		
	}
	
	int[] newArray = new int [a.length];
	
	int count = 0 ;
	for (int number :a) {
		if (number != 0) {
			newArray [count] = number;
			count ++ ;
			
		}
	}
	
	 return newArray;
	 
}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		int i []	= { 1, 0, 0, 0, 5, 6, 0} ;	
		
	System.out.println(Arrays.toString(ShiftZeroToRight(i))) ; 	
		
		
		
		
		
		
		
		
		
		

	}

}
