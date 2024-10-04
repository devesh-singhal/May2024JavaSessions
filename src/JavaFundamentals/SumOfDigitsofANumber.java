package JavaFundamentals;

public class SumOfDigitsofANumber {

 private static int number;







public static int GetSumofNumber(int number) {
	 
	int sum1 = 0;
	 
	 while (number!= 0 ) {
		 
		 sum1 = sum1 + number % 10 ; // 5
		 //removes the last digit
		 
		 number = number /10; // 12554
		 
	 }
	 
	 return sum1;
 }

	public static void main(String[] args) {
		
		int number = 1234;
		
		System.out.println("sum of digits is .." +GetSumofNumber(567657678));

	}

}
