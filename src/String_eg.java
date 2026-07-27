 
//public class String_eg {
//	public static void main(String[] args) {
//		String s1 = "Demo";
//		String s2 = "Demo";
//			String s3 = new String("Demo");
//			System.out.println(s1.hashCode());
//			System.out.println(s2.hashCode());
//			
//			System.out.println(s3.hashCode());
//			
//			System.out.println(System.identityHashCode(s1));
//			System.out.println(System.identityHashCode(s2));
//			System.out.println(System.identityHashCode(s3));
//			
//			if(s1==s2) {                                               // ( == is a operator and its compare reference )
//				System.out.println("Both String refrence are equal");
//    	}
//			else {
//				System.out.println("Both String refrence are not equal");
//			}
//			
//			if(s1==s3) {
//				System.out.println("Both Strung refrence are equal");
//		}
//			else {
//				System.out.println("Both String refrence are not equal");
//			}
//			
//			if(s1.equals(s2)) {                                              // ( .equals method are compare its data )
//				System.out.println("Both String values are equal");
//		}
//			else {
//				System.out.println("Both String valuse are not equal");
//			}
//			
//			System.out.println(s1.length());
//			
//			for(int i=0; i<s1.length(); i++) {                        // using for loop
//				System.out.println(s1.charAt(i));
//			}
//			
//			char arr[] =s1.toCharArray();                             // toCharArray is use to convert string in to character array (all character are separate)
//			
//			for(int j=0; j<arr.length; j++) {
//				System.out.println(arr[j]);
//			}
//			
//			
//	}
//
//}

public class String_eg {
	public static void main(String[] args) {
		String s1 = "Demo";
		String s2 = "Jayesh";
		String s3 = new String("Hello");
		System.out.println("After creating new object s3" + System.identityHashCode(s3));
		String s4 = s1;
		String s5 = new String("Jayesh"); 
		 s1="ABC";
		 s2=s4;
		 s4=s3;
		 s3=s1;
		 System.out.println("After changing value of object s3" + System.identityHashCode(s3));
		 System.out.println("After changing value of object s1" + System.identityHashCode(s1));
		String s6 ="Hello";		 
		
		if(s2==s5) {                                            // reference(object) check krto
			
			System.out.println("Checking s5 hashcode" +System.identityHashCode(s5));
			System.out.println("Checking s2 hashcode" +System.identityHashCode(s2));
			System.out.println("Both string are equal : checing s2==s5");
		}
		 if(s2.equals(s5)) {
			System.out.println("value checking : checking s2.equals(s5)");
		}
		else {
			
		}
		
		if(s1.equals(s4)) {                                               // compare text in string
			System.out.println("Checking s4 hashcode" +System.identityHashCode(s4));
			System.out.println("Checking s1 hashcode" +System.identityHashCode(s1));
			System.out.println("both string values are equal : checking s1.equal(s4)");
		}
		if(s1==s4){
			System.out.println("values are not equal: checing s1==s4");
		}
		if(s2==s4){
			System.out.println("values are not equal: checing s2==s4");
		}
		if(s2.equals(s4)){
			System.out.println("values are not equal: checing s2 equals s4");
		}
		if(s6.equals(s4)){
			System.out.println("values are not equal: checing s3 equals s4");
		}
		if(s6==s4){
			System.out.println("values are not equal::: checing s3==s4");
		}
		if(s3==s1){
			System.out.println("Reference are equal::: checing s3==s1");
		}
		if(s3.equals(s1)){
			System.out.println("Reference are equal::: checing s3 equal s1");
		}
		
		
		
	}
}















