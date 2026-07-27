interface A {
	int i = 10;
	void fun();                              // fun method
}

interface B {
	int i = 20;
	void fun();                               // fun method
}
class C implements A,B{
	public void fun() {
		System.out.println("fun of C");
	}
}
public class Interface {
	public static void main(String[] args) {
		C cobj = new C();
		cobj.fun();                            // fun call ( class madhalyA FUN METHOD KADE GELA)
		
	//	System.out.println(cobj.i);             ambiguity  ( not clearity)
		System.out.println(A.i);
		System.out.println(B.i);
		
	}

}
