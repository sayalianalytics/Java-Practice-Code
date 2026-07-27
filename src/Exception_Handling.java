import java.util.Scanner;
import java.lang.Exception;

class Exception_Handling1 {
	public void fun() {
		System.out.println("Insude fun");
		Scanner sc = new Scanner(System.in);
		int arr[] = {10, 20, 30, 40};
		
		int no1=0, no2=0, ans=0;
		System.out.println("Enter array index");
		no1 = sc.nextInt();
		
		System.out.println("Enter second number");
		no2 = sc.nextInt();
		
		try {
			ans = arr[no1]/no2;                        // Exception occur
			
			int z=2+2;                                                 // exception aal tr lagrch catch madhe zail prt try madhe yenar nahi 
			System.out.println("Addition is"+z);		
			}
		
		catch(ArrayIndexOutOfBoundsException Sc) {
			System.out.println(sc);
			
			System.out.println("Array Index Invalid");
		}
		
		catch(ArithmeticException Sc) {
			System.out.println("Divide by Zero");
		}
		
		catch(Exception Sc) {
			System.out.println("Inside generic catch");
		}
		 
		finally {
			System.out.println("Inside Finally");
		}
		
		System.out.println("Division is " + ans);
	}

	
	
}

class Exception_Handling{
 public static void main(String[] args) {
	 System.out.println("Inside Main");
	 Exception_Handling1 sc = new Exception_Handling1();
	 sc.fun();
	 
	 System.out.println("Return from Main");
  }
}


