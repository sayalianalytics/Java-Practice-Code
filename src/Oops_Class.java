/*  class Student{

  String name;                                             // There is only one public class in a single java file
  int age;
  
  void display() {                                               // Example 1
	  System.out.println("Name: " + name);
	  System.out.println("Age: " + age);
   }
  }
*/

 class Car{                                            // class
	 String brand;
	 String colour;                                   // brand & colour instance variable( data)
	 
	 void start() {
		 System.out.println("Car is starting");
	 }                                                  // start & display methods (Behavior)
	                                                    
	 void display() {
		 System.out.println("brand: " + brand );
		 System.out.println("colour: " + colour );
	 }
 }
public class Oops_Class {
	public static void main (String[] args) {
		
	/*	Student s1 = new Student();                       // object
		
		s1.name = "Sayali";                                           //Example 1
		s1.age = 26;
		
		s1.display();
*/	 
		
		Car c1 = new Car();                                        // c1 is object of car class & new car() is object creation
			c1.brand = "TATA";
			c1.colour = "White";
			
					c1.start();
			        c1.display();
			        
		
	}

}
