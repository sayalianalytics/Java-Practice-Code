import java.util.Scanner;
public class Ifelse {

	public static void main(String[] args) {
	//	int marks;
	//System.out.println("Enter your marks");
	//	Scanner sc = new Scanner(System.in);
	//	marks = sc.nextInt();
	//	if(marks>60) {
	//	System.out.println("You have passed with a frist class");
	//	}
	//	else if(marks>40) {
	//		System.out.println("You have passed with second class");
	//	}
	//	else if(marks>=35) {
	//		System.out.println("You have passed with third class");
	//	}
	//	else {
	//		System.out.println("You have fail");
	//	}
		
		
		
	
//		System.out.println("Enter your grade");
	//		Scanner sc = new Scanner(System.in);
//			char grade = sc.next().charAt(0);
	//	switch(grade)
//		{
	//	  case 'A':
//		   System.out.println("Excellent");
	//	   break;
//		  case 'B':
	//	   System.out.println("Good");
//		   break;
	//	  case 'C':
//			System.out.println("Average");
	//		break;
//		  default:
	//		 System.out.println("Fail");
//		  
	//	}
		
	//IfElse Questions
		
		int a = 10;
		if(a == 27) {                          // == is used for check equality
		  System.out.println("I am 11");	
		}
		else {
			System.out.println("I am not 11");
		}
		
	// 2nd Question
		
		byte m1, m2, m3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Physics marks");
		m1 = sc.nextByte();
		System.out.println("Chemistry marks");
		m2 = sc.nextByte();
		System.out.println("Mathematics marks");
		m3 = sc.nextByte();
		float avg = (m1+m2+m3)/3.0f;
		System.out.println("Your overall percentage is:"+avg);
		if(avg>=40 && m1>=33 && m2>=33 && m3>=33) {
			System.out.println("Congratulations, you have been promoted");
		}
		else {
			System.out.println("Sorry, you have not been promoted");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
