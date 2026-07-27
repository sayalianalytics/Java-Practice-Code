// Problem 1

/* class Employee {
	int Salary;
	String name;
	public int getsalary(){                   // 1
		return Salary;
	}
	public String getname() {                // 2              this 3 are methods
		return name;
	}
	public void setname(String n) {          // 3       // no return thats way void
		name= n;
	}
}
*/

// Problem 2

/* class cellphone{
	public void ring() {
		System.out.println("ringing....");
	}
	public void vibrate() {
		System.out.println("vibrating....");
	}
	public void callfriend() {
		System.out.println("calling Jayesh");
	}
  }
*/

//Problem 3

/*  class square{
	  int side;
	  public int area() {
		  return side*side;                             // Area = a*a ,  where a = side length
	  }
	  public int parimeter() {                         // parimeter of square is p = 4a
		  return 4*side;
	  }
  }
*/

//Problem 4

  class Rectangle {
	  int length;
	  int width;
	  public int area() {
		  return length*length;
	  }
	  public int perimeter() {
           return 2*(length+width);		  
	  }
  }


     public class Oops_Practice {
     public static void main (String[] args) {
    	 
    //	 Problem 1
//    	 Employee e = new Employee();
//    	 e.setname("Sayali");
//    	 e.Salary = 40000;
//    	 System.out.println(e.getname());
//    	 System.out.println(e.getsalary());
    	 
   // Problem 2
//    	 cellphone google = new cellphone();
//    	 google.callfriend();
//    	 google.vibrate();
//    	 google.ring();
    	
     // Problem 3
//    	square sq = new square();
//    	sq.side = 5;
//    	System.out.println(sq.area());
//    	System.out.println(sq.parimeter());
    	
    //Problem 4
       Rectangle ra = new Rectangle(); // new keyword used ro create dynamic object 
       ra.length = 3;
       ra.width = 3;
       System.out.println("Area Answer is: "+ra.area()+" "+ "Paramiter Anser is : "+ra.perimeter());
       
    	 
    	 
    	 
    	 
    	 
    	 
    	 
 }
     
}