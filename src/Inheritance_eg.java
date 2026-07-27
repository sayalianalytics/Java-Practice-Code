class base{                                      // Parental calss
	public int x;
	
	public void setx(int x) {
		System.out.println("I am base & setting x now");
		this.x = x;
	}
	  public int getx() {
		  return x;
	  }
	  public void printme() {
		  System.out.println("I am a constructor");
	  }
  }

     class derived extends base{                           // Inheritance in java is declared using extends keyword
    	 public int y;
    	 
    	 public void sety(int y) {
    		 System.out.println("I am derived & setting y now");
    		 this.y = y;
    	 }
    		 
    		 public int gety() {
    		 return y;
    	 }
     }

public class Inheritance_eg {
	public static void main (String[] args) {
		base b = new base();                  // Creating an object of base class
		b.setx(5);
		System.out.println(b.getx());
		
		derived d = new derived();           // Creating an object of derived class
		d.sety(3);
		System.out.println(d.gety());
		
	}

}
