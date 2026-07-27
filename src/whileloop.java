
public class whileloop {  

	public static void main(String[] args) {
 //     int i = 100;
//    while(i<=200) {
//    	System.out.println(i);
//    	i++;
//    }
//     System.out.println("Finish while loop");
      
     //do-while loop
//    int i=100;
//     do {
//    	 System.out.println(i);
//    	 i++;
//     }while(i<=200);
     
     //for loop
//     for(i=100; i<=200; i++){
//    	 System.out.println(i);
 //   }
		
//		int a = 20;
//		while(a<=50) {
//		System.out.println(a);
//		a++;
//		}
//		
//		int b = 5;
//		do {
//			System.out.println(b);
//			b++;
//		}while(b<11);
		
//		int c = 10;
//		do {
//			System.out.println(c);
//			c++;
//		}while(c<25);
		
//		int d = 3;
//		for(d=3; d<=6; d++) {
//			System.out.println(d);
//		}
	//Question	
	//print frist n odd numbers using for loop
	  //even number = 2n = 0,2,4,6,8
	  //odd number = 2n+1 = 1,3,5,7,9
		
//       int n = 3;                     // n=3 means print the 3 numbers
//       for(int i=0; i<n; i++) {
//    	   System.out.println(2*i+1);
//       }
		
	// Reverse for loop 
//		for(int i=10; i>0; i--) {              // 1st print 10 then, i-- means i becomes 9 then check the condition and print, like that
//			System.out.println(i);                                  // or i!=0 is also use 
//		}
		
		
//		int n = 20;
//		for(int i=n; i!=10; i--) {                           //  frist n natural number in revers order
//			System.out.println(i);
//		}
//		
//		
		
	// Inner for loop:
		
		for (int i =1;i<=10;i++) {
			
			
			//if(i%2==0) {
			for(int j=1;j<=10;j++) {       // this for loop mutiply to upper for loop value upto 10 times
				
				int x= i*j;
				
				System.out.println(x);
							
			}
		//	}
//			else {
//				for(int j=1;j<=10;j++) {
//					
//					int x= i*j;
//					
//					
//						System.out.println(x);					
//					
//				}
//				
//			}
			
			System.out.println();
		}
		
		
		
		
		
		
}
}
