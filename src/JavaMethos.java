
public class JavaMethos {
	static int logic(int x, int y) {         //  a,b chi value ani a1,b1 chi value x, y madhe yeil  
		int z;
		if(x>y) {
			z= x + y;
		}
		else {
			z = (x+y)*5;
		}
		return z;               // that means its a logic 
			
	}
	public static void main(String[] args) {
		int a = 5;
		int b = 7;
		int c;
		
	// JavaMethod obj = new JavaMethod();                        //method invocation using object creation
	// c = obj.lojic(a, b);                        
		c = logic(a, b);
		System.out.println(a + " " + b);
		System.out.println(c);
		
		int a1 = 2;
		int b1 = 1;
		int c1;
		c1 = logic(a1, b1);
		System.out.println(c1);
		
		
		
		
		
		
		
		
	}

}
