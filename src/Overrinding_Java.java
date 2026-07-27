class Base {
	public void fun() {
		System.out.println("Base fun");
  }
	public void gun() {
		System.out.println("Base gun");
	}
	public void sun() {
		System.out.println("Base sun");
  }
	public void man() {
		System.out.println("Base man");
	}
	public void man(int no) {
		System.out.println("Base man");
	}
}

class Derived extends Base {
	public void gun() {
		System.out.println("Derived gun");
  }
	public void run() {
		System.out.println("Derived run");
	}
	public void sun(int no) {
		System.out.println("Derived sun");
  }
	public void man(int no) {
		System.out.println("Derived man");
	}
}
public class Overrinding_Java { 
	public static void main (String[] args) {
		Base bobj = new Derived();                  // upcasting ( child class object store in parent class refrence variable )
		
		bobj.fun();
		bobj.gun();
		bobj.sun();
		bobj.man();
		bobj.man(11);
    //	bobj.run();
		
	}

}
