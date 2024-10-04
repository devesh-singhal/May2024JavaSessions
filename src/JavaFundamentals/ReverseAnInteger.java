package JavaFundamentals;

public class ReverseAnInteger {

	public static void main(String[] args) {
		
		
		//1. Using Algo 
		int num = 12345;
		int rev = 0;
		
		while (num !=0) {
			rev = rev*10 + num % 10;
			num = num /10 ;

			
		}
		System.out.println("reversed number is :::: "  +rev);
		
		
		// using String Buffer method
		 int number = 12345;
		 System.out.println("reversed number is :::: "  +new StringBuffer(String.valueOf(number)).reverse());
		 
	}

}












