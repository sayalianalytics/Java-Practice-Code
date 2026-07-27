 
public class String_exmple {
	public static void main(String[] args) {
		// Length
		
//		String s1 = "Java";
//	System.out.println("Length= " + s1.length());
	
//	String s1 = "Java Developer";
//	System.out.println("Length= "+s1.length());

		//trim
  
//		String s1 ="     Sayali     ";
//		System.out.println("Before trim = "+ s1);
//		System.out.println("After trim = "+s1.trim());
		
//		String s1 = "  Grantha      ";
//		System.out.println("Before trim length = "+ s1.length());
//		System.out.println("After trim length = "+ s1.trim().length());
		
		
		// SubString
	
//		String s1 = "SayaliJayeshChaudhari";
//		System.out.println(s1);
//		System.out.println(s1.substring(6));
//		System.out.println(s1.substring(12));
//		
//		String s2 = "SayaliJayeshChaudhari";
//		System.out.println(s2.substring(6,12));
//		System.out.println(s2.substring(12,21));
		
		//replace
		
//		String s1 = "Chaudhari";
//		System.out.println("Before replace = "+s1);
//		System.out.println("After replace = "+s1.replace("i", "y"));                  // charecter replace
//		
//		String s2 = "I Love Java";
//		System.out.println(s2.replace("Java", "SQL"));                            // word replace
//		
//		String s3 = "Banana";
//		System.out.println(s3.replace("na", "xy"));                             //multiple replace
		
		// charAt
		
//		String s1 = "Sayali";
//		System.out.println(s1.charAt(0));
//		System.out.println(s1.charAt(1));
//		System.out.println(s1.charAt(2));
//		System.out.println(s1.charAt(3));
//		System.out.println(s1.charAt(4));
//		System.out.println(s1.charAt(5));
		
	//	System.out.println(s1.charAt(s1.length()-1));
		
//		String s2 = "Jayesh";
//		System.out.println(s2.charAt(0));
//		System.out.println(s2.charAt(s2.length()-1));
//		
//		 if(s2.charAt(2)=='y') {
//			 System.out.println("1st charter is y");
//		 }
//		 else {
//			 System.out.println("Is not y");
//		 }
		
//		String s1 = "Sayali";
//		char  s = s1.charAt(2);
//		
//		if(s>='A' && s<='Z') {                                      // to check capital charecter
//			System.out.println("Uppercase Letter");
//		}
//		else {
//			System.out.println("Lowercase Letter");
//		}
		
		
		// concat (join 2 strings)
//		
//	         String Firstname = "Sayali";
//	         String Lastname = "Chaudhari";
//	          
//	         String Fullname = Firstname.concat(Lastname);                       // no space
//	         
//	         System.out.println(Fullname);
//	         
//	         System.out.println(Firstname.concat(" ").concat(Lastname));
//	          
//	         String s1 = "Java";
//	         String s2 ="SQL";
//	         System.out.println(s1.concat(s2));                    // no space
//	         System.out.println(s1.concat(" ").concat(s2));         // with space
		
		
		// string + string literal
		
//		String s1 = "Good";
//		String s2 = s1.concat(" ").concat("Morning");
//		System.out.println(s2);
		
//		String x = "Java";
//		x.concat("Programming");                       // return value not stored
//		System.out.println(x);
//	         
//	     String a = "Java";
//	     String b = a.concat(" ").concat("Programming");
//	     System.out.println(b);
		
		// split
		
//		String s1 = "Sayali Jayesh Chaudhari";
//		String arr[] = s1.split(" ");                           // according to space
//		for(String s:arr) {
//		System.out.println(s);
//		}
		
//		String a = "Java,SQL";                                  // according to comma
//		String arr[] = a.split(",");
//		for (String b : arr) {
//			System.out.println(b);
//		}
		
		
//		String x = "1-2-3-4-5";                              // according to -
//		String[] arr = x.split("-");
//		for(String y:arr) {                               // ek ek karun print krt
//			System.out.println(y);
//		}
		
		String Date = "16/6/2026";
		String[] arr = Date.split("/");
		System.out.println("Day :"+ar r[0]);
		System.out.println("Month :"+arr[1]);
		System.out.println("Year :"+arr[2]);
	         
        
		
	} 

}
