   // String reverse using 4 methods
public class String_eg_2 {
	public static void main(String[] args) {
		String s ="Sayali";
		
//		 for(int i=s.length()-1; i>=0; i--) {                          // using loop
//		  System.out.println(s.charAt(i));
//		  }
//		 
//		 
//		// StringBuilder sb = new StringBuilder(s);                           // using string builder
//		// System.out.println(sb.reverse());
		
		StringBuffer sb = new StringBuffer(s);                          // using string buffer
         System.out.println(sb.reverse());
		
		
		
		
//		char arr [] = s.toCharArray();
//		for(int i=arr.length-1; i>=0; i--) {                               // using array
//			System.out.print(arr[i]);
//		}
	}

}
