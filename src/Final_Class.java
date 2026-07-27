final class Base{
	public void fun() {
		System.out.println("Inside Base fun");
	}
}

//  class Derived extends Base      Not Allowed

 class Hello{
	 public Base bobj = new Base();                // Composition ( it is consider as reusibility.
	 public void fun() {
		 bobj.fun();                                 // its a Base fun
		 System.out.println("Hello fun");
	 }
	 
 }
public class Final_Class {
  public static void main(String[] args) {
	  Base bobj = new Base();                            // object of Base class
	  Hello hobj = new Hello();                         // object of Hello class
	  hobj.fun();
	  hobj.bobj.fun();                                // call the fun() method of the Base object
  }
}
