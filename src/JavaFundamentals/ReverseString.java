package JavaFundamentals;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "LAHGNIS HSEVED" ; 
//		int length = s.length() ; // 6
//				String reverse = "" ;
//		
//		for (int i= length-1 ; i >=0 ; i-- ) {
//			reverse = reverse+s.charAt( i) ;
//			
//		}
//		System.out.println(reverse);
		
		
		StringBuffer sf = new StringBuffer(s) ;
		System.out.println(sf.reverse());
		
 	}

}
