package JavaFundamentals;

public class MissingNumber {

	public static void main(String[] args) {
	
	 int a[] = {150, 151, 152, 154} ;
	 int sum =0;
	 
	 for ( int i =0; i<a.length ; i ++) {
		 sum = sum + a[i];
		 
	 }
		System.out.println(sum);
		
		
		int sum1 = 0;
		for (int j=150 ; j<=154 ; j++) {
			sum1 = sum1+j;
			
		}
		System.out.println(sum1);
		System.out.println("Missing number is " + (sum1-sum));
		
		

	}

}
