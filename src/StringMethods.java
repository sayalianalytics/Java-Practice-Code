
public class StringMethods {

	public static void main(String[] args) {
		String name = "Sayali";
		int value = name.length();                  //lenght
		System.out.println(value);
		
		String lstring = name.toLowerCase();               //tolowercase
		System.out.println(lstring);
		
		String ustring = name.toUpperCase();              //touppercase
		System.out.println(ustring);
		
		String nontrimmedstring = "    Sayali    ";
		System.out.println(nontrimmedstring);
		                                                        //trim
		String trimmedstring = nontrimmedstring.trim();
		System.out.println(trimmedstring);
		
		System.out.println(name.substring(3));
		                                                  //substring
		System.out.println(name.substring(2,5));
		
		System.out.println(name.replace('i', 'y'));            //replace
		
		System.out.println(name.charAt(1));                  
		                                                     //charAt
		System.out.println(name.charAt(4));
		
		System.out.println(name.startsWith("Sa"));            //startswith
		
		System.out.println(name.startsWith("ay"));
		
		System.out.println(name.endsWith("ali")); 
		                                                      //endswith
		System.out.println(name.endsWith("i"));
		
		System.out.println(name.indexOf("al"));
		                                                     //indexOf
		System.out.println(name.indexOf("a"));
		
		System.out.println(name.equals("Sayali"));           //equals
		System.out.println(name.equals("SayA li"));
		
// StringBuilder Concepts
		
		StringBuilder sb = new StringBuilder("Tony");
		System.out.println(sb);
		
	//	System.out.println(sb.charAt(0));
		                                                      //charAt
	//  System.out.println(sb.charAt(3));
		
		//sb.setCharAt(0, 'P');
		//System.out.println(sb);                            //setCharAt
		
		//sb.insert(0, 'S');
		//System.out.println(sb);                            //insert new char
		
		sb.insert(2, 'n');
		System.out.println(sb);
		
	//	 sb.delete(2, 3);
		// System.out.println(sb);                         //delete the extra 'n'
		  
		 sb.delete(2, 4);
		 System.out.println(sb);
		 
		 sb.append("s");
		 System.out.println(sb);                    //append means to add something at the end
		 
		 
//Questions for String
		 
	//	public class stringque {
	// public static void main(String[] args) {
		 
 //Question 1 - convert a string to lower case
		 String fullname = "Jayesh Chaudhari";
		fullname = fullname.toLowerCase();
		 System.out.println(fullname);
		 
//Question 2 - replace space to underscores
		 String text = "Jayesh S Chaudhari";
		 text = text.replace(" ", "_");
		 System.out.println(text);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
	}

}
