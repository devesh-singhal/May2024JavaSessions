package JavaFundamentals;

public class ArmstrongNumber {

	
	
	private int num;

	public static void isArmstrongNumber(int num ) {
		
		int cube = 0;
		int r;
		int t;
		
		t= num;
		while   (num >0 ) {
			 r = num%10;
			 num = num/10;
			 cube = cube + (r*r*r);
		}
		if( t == cube) {
			System.out.println("this is an armstrong number");
			
		} else {
			System.out.println("this is not an armstrong number");
			 			
		}
		
	
	}
	
	public static void main(String[] args) {
	
		isArmstrongNumber(155) ;
	}

}
