class Circle {                                       // Parent Class
	public float radius;
	public float pi = 3.14f;
	
	public Circle (float value) {                       // Constructor
		System.out.println("Constructor of circle");
		this.radius = value;
	}
	public float area() {
		float ans = 0.0f;
		ans = pi * radius * radius;
		return ans;
	}	
}
 class Newcircle extends Circle {                                 // Child class
	public Newcircle (float no) {
		super (no);
		System.out.println("Constructor of Newclass"); 
	
	}
	public float Circumference() {
		float ans = 0.0f;
		ans = 2 * pi * radius;
		return ans;
	}
}
public class Inheritance_Final {
	public static void main (String[] args) {
		System.out.println("Inside main");
		Circle Cobj = new Circle(3.9f);              // Refrence Cobj is the object of circle thats way 
		 
		float FRet = 0.0f;
		FRet = Cobj.area();
		System.out.println("Area is " + FRet);
	
	Newcircle Nobj = new Newcircle(6.10f);
	
	
	FRet = Nobj.area();
	System.out.println("Area is "+ FRet);
	
	FRet = Nobj.Circumference();
	System.out.println("Circumference is "+ FRet);
	

  }
} 