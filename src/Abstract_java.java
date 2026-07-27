abstract class Demo{
	public int i;                                          // variable declared
	
		public Demo() {                                  // Constructor
		System.out.println("Demo Constructor");
		i = 10;
	}
		public static void run() {                           // Static method
			System.out.println("Inside static run Demo");
	}
		public void fun() {                                  // Concrete method
			System.out.println("Inside fun Demo");
	}
		public abstract void gun();                        // Abstract method
}

class HelloDemo extends Demo{
	public HelloDemo() {                                   // constructor
		System.out.println("HelloDemo Constructour");
	}
	  public void fun() {                            // concrete method
		  System.out.println("HelloDemo fun"); 
   }
	  public void gun() {                              // concrete method
		  System.out.println("HelloDemo gun"); 
	  }
}
public class Abstract_java {
	public static void main(String[] args) {
//		Demo.dobj1 = new Demo();                abstract class object cannot created                   
		Demo dobj2;                            // Demo type cha refrence variable tayal zal
		dobj2 = new HelloDemo();                  // Upcasting ( hello cha object tayar zala ani to dobj2 madhe store zala)
		Demo.run();                           // static method i.e calling class name
		dobj2.fun();
		dobj2.gun();
		
		System.out.println(dobj2.i);
	}

}
