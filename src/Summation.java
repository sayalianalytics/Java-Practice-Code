import java.util.Scanner;

public class Summation {

	public static void main(String args[]) {
		
		System.out.println("Sum");
		
		String abc="Gran";
		String xyz = "tha";
		
		String pqr= "abc+xyz";
		
		System.out.println("sum="+(2-10));
		
		System.out.println("Output="+pqr);
		
		System.out.println("Mult="+(5*5));
		
		System.out.println("Div="+(9/9));
		
		System.out.println("output="+abc+xyz);
		
		String fristname= "sayali";
		String lastname= "chaudhari";
		
		System.out.println("fullname="+fristname+lastname);
		
	//	Question1 Sum
		int a = 9;
		int b = 15;
		int c = 6;
		int sum = a+b+c;
		System.out.println(sum);
		
	//	Question2 CGPA
		float subject1 = 30;
		float subject2 = 40;
		float subject3 = 50;
		float CGPA = (subject1 + subject2 + subject3)/30;
		System.out.println(CGPA);
		
	//	Question3 text Input (Scanner.in)
		System.out.println("What is your name");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.println("Hello " + name + " have a good day!");
		
	//  Quetion5  Integer or not
		System.out.println("Enter your number");
		Scanner sc2 = new Scanner(System.in);
		System.out.println(sc2.hasNextInt());
		
		boolean  j = sc2.hasNextInt();
		
		if(j==true) {
			
			System.out.println("Value is Int"+" "+ j);
			
		}else {
			
			System.out.println("Value is Float"+" "+ j);
		}
		
		
		 //  Question4 kilometers to miles
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter distance in kilometers:");
		double kilometers = sc1.nextDouble();
	 // 1 km = 0.621371 miles
		double miles = kilometers * 0.621371;
		System.out.println("Distance in Miles:" + miles);
		sc1.close();
	}
	
}

   
 

