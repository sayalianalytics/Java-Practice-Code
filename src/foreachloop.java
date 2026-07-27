
public class foreachloop {
	public static void main(String[] args) {
	  int[] marks = {50, 60, 70, 80, 90, 95};
  /*  System.out.println(marks[0]);
	  System.out.println(marks[1]);
	  System.out.println(marks[2]);                  // to long way
	  System.out.println(marks[3]);
	  System.out.println(marks[4]);
   */
	  
// Using for loop
	  for(int i=0; i<marks.length; i++) {
		  System.out.println(marks[i]);
	  }

// Using for loop reverse order
	  for(int i=marks.length-1; i>=0; i--) {                // marks.length = 5 so 5-1=4, then it prints from marks[4]
		  System.out.println(marks[i]);
	  }
	  
	   
		
		
		
		
		
		
	}

}
