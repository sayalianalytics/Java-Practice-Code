
public class Recursoin {
	     //factorial(n) = n * factorial(n-1)
		//factorial(n) = n* n-1 * ...1
		//factorial(5) = 5 * 4 * 3 * 2 * 1 = 120
/*		static int factorial(int n) {
			if(n==0 || n==1) {
				return 1;
			}
			else {
				return n *  factorial(n-1);
			}
		
		}
		public static void main(String[] args) {
			int n = 5;
			System.out.println("The value of factorial is : " + factorial(n));
		
	}
	*/

 /*       static void factorial(int n) {
        	if(n<=5) {
        		System.out.println(n);
        		factorial(n + 1);                                   
        	}
        }
        	public static void main (String[] args) {
                 factorial(1);
        	}
    */
	
	       static int PrintNum(int x) {
	    	   if(x==1) {                          // ithe true condition yei parynat x firel
	    		   return 1;
	    	   }
	    	     return x * PrintNum(x-1);               // 5 * printnum(5-1)
	       }
	        public static void main(String[] args) {
	        	int x = 6;
	        	System.out.println("Factorial value is : " + PrintNum(x));
	        }
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


