
public class LogicalOperators {

	public static void main(String[] args) {
		int age = 30;
		if(age>=20 && age<=50) {
			System.out.println("Eligibal");                //AND Operator
		}
		
		int marks = 45;
		if(marks>=40 || marks==35) {
			System.out.println("Pass");                    //OR Operator
		}                                             
		
		
		
		boolean shopopen = true;
		if(!shopopen) {
			System.out.println("shop is closed");
		}
		else {
			System.out.println("shop is open");
		}
		                                                                    //NOT operator
		                                                                     //  (shift + 1 = !)
		boolean charged = false;
		if(!charged) {
			System.out.println("charge your phone");
		}
		else {
			System.out.println("phone is ready");
		}
		
		
		
       
	}

}
