package JavaFundamentals;

public class StudentSheet {
	
	//WAF : getStudentMarks (String name)
	// return:  marks(int)
	// marks 0 to 100
	
	public int getStudentMakrs (String name) {
	System.out.println("student name: " +name);
	 
    switch (name.toLowerCase().trim()) {
    case "devesh":
    return 80;
    
    case "kunjan":
        return 50;
        
    case "anuj":
        return 30;
        
    case "naveen":
        return 20;
        
    
      default:
    	  System.out.println("Please pass the correct student name: " + name);
      break;
    
    
	}
	return 0;
    
	}

	public static void main(String[] args) {
		
		StudentSheet stsheet = new StudentSheet();
		int marks= stsheet.getStudentMakrs("naveen");
		System.out.println(marks);
		
		if(marks>0) {
			System.out.println("print the student marksheet of given student name");
		}
		
	}

}
