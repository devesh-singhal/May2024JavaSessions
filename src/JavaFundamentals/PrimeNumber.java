package JavaFundamentals;

public class PrimeNumber {

	
		
		
		
		public static boolean isPrimeNumber(int number) {  
		// corner case:
		if (number <=1) {
			return false;
			
		}
			for ( int i =2; i< number ; i++) {
				if (number % i == 0) {
					return false;
			} 
			
			}
		return true;
		}
			
		// Based on range let say print prime nos. upto 20;	
		
		public static void getPrimeNumbers(int num) {
			for ( int i=2 ; i<=num; i++) {
				if (isPrimeNumber(i)) {
					System.out.print(i + " ");
				}
			}
		}
		
		
		
				public static void main(String[] args) {
			
	            boolean prime = isPrimeNumber (30) ;
	            System.out.println(prime);
	            
	            getPrimeNumbers(20) ;            
		
		}	

	}


