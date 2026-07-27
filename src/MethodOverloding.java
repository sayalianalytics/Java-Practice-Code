
public class MethodOverloding {
	void add(int a, int b) {                              //method 1
		System.out.println("sum : " + (a+b));
	}
	void add(int a, int b, int c) {                          //method 2
		System.out.println("sum : " + (a+b+c));
	}
	void add(double a, double b) {                         //method 3
		System.out.println("sum : " +(a+b));
	} 
	 
	public static void main(String[] args) {
		MethodOverloding obj = new MethodOverloding();
		obj.add(10, 20);                                         //method 1
		obj.add(10, 20, 30);                                     //method 2
		obj.add(2, 5);                                           //method 3
	}

}
