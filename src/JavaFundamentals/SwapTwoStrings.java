package JavaFundamentals;

public class SwapTwoStrings {

	public static void main(String[] args) {
		
		String a = "Devesh";
		String b = "Singhal";
		System.out.println("before swapping...");
		System.out.println("the value of a is : "+a);
		System.out.println("the value of b is : "+b);
		
// Now append a and b:
		a = a+b ;// DeveshSinghal
				b= a.substring(0, a.length() -b.length()    );
		
		    a = a.substring(b.length());
		    
		    System.out.println("after swapping...");
		    
		    System.out.println(a);
		    System.out.println(b);
		
		
		
	}

}
