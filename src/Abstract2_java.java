import java.util.Scanner;

abstract class RBI{
	public int amount = 0;

	 public void credit(int value) {                            // concrete method
		 System.out.println("Amount successfuly Credited");
		 amount = amount + value;
	 }
	  public int debit(int value) {
		  if(value > amount) {
			  System.out.println("Insufficient Balence");
			  return 0;
		  }
		  else { 
			  amount = amount - value;
			  System.out.println("Successfuly Withdrawel");
			  return value;
		  }
	  }
		    public abstract float InterestSaving();
		    public abstract float InterestLoan();
		    public static void DisplayRule() {
		    	System.out.println("Pancard is Compalsary");
		    	System.out.println("KYC is Necessary");
		    }
	}
 
 class SBI extends RBI{
	 public float InterestSaving() {
		 return 6.3f;
	 }
	 public float InterestLoan() {
		 return 8.3f;
	 }
	  public void SBIOffers() {
		  System.out.println("Be offer more interest for senoir citizen");
		  System.out.println("Be provide 0 balance account");
	  }
 }
 
  class PNB extends RBI{
	  public float InterestSaving() {
			 return 8.5f;
		 }
		 public float InterestLoan() {
			 return 10.5f;
		 }
		  public void Pensionskim() {
			  System.out.println("Be provide 10,000 as a pension amount");
		  }
  }
 
public class Abstract2_java {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the bank name in which you have to create the acount");
		
		RBI robj = null;
		
		String name = sc.nextLine();
		if(name.equals("SBI")) {
			robj = new SBI();
		}
		else 
			if(name.equals("PNB")) {
				robj = new PNB();
			}
		
		System.out.println("Enter amount to deposite");
		int no = sc.nextInt();
		robj.credit(no);
		
		System.out.println("Interest for saving is " + robj.InterestSaving());
		RBI.DisplayRule();
	
	}

}
