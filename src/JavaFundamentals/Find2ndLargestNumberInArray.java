package JavaFundamentals;

import java.util.Arrays;

public class Find2ndLargestNumberInArray {

	public static void main(String[] args) {
	
		int numbers[] = {20, 50, 80, 150, 56556 };
		int largest = numbers [0];
		int smallest  = numbers [0];
		
		for (int i= 1; i<numbers.length-1; i ++  ) {
			if (numbers [i] > largest) {
				largest =numbers [i];
				
			} else if (numbers [i]< smallest) {
				smallest = numbers[i];
				
			}
		}
		
		 System.out.println("given array is : " + Arrays.toString(numbers));
		 
		 System.out.println("largest number is " +largest);
		 System.out.println("smallest number is " + smallest);

	}

}
