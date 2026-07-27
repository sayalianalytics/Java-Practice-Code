
public class Arrays {
	public static void main (String[] args) {  
// 1)  declaration and memory allocation
	/*	int[] marks = new int[5];
		marks[0] = 	50;
		marks[1] =  59;
		marks[2] =  67;
		marks[3] =  80;
		marks[4] =  74;
		System.out.println(marks[4]);
		                                                           // This 3 ways to create array in java
// 2)  declaration then memory allocation
	 	int[] number;
		number = new int[3];
		number[0] = 100;
		number[1] = 200;
		number[2] = 300;
		System.out.println(number[1]);
	*/
		
// 3)  declaration and initialization
		int[] values = {101, 102, 103, 104, 105};
		System.out.println(values[4]);
		
		
// Length of array 
		System.out.println(values.length);
		
		
// Using string in array
		String[] family = {"Sayali", "Jay", "Grantha"}; 
		System.out.println(family[2]);
		System.out.println(family.length);
		
		
// Multi-Dimensional Array:
	//	int[] marks;   		  1 dimensional array
		
		int[][] flats;        // 2 dimensional array
		flats = new int[2][3];
		flats[0][0] = 101;
		flats[0][1] = 102;
		flats[0][2] = 103;
		flats[1][0] = 201;
		flats[1][1] = 202;
		flats[1][2] = 203;
		for(int i=0; i<flats.length; i++) {                       //flats length is 2
		for(int j=0; j<flats[i].length; j++) {                 // nested loop
			System.out.print(flats[i][j] + " ");          // println chya jagi ptint ghetl aahe karan same line vr with space print hoil
		
		}
		System.out.println("");
		
		
		
	}
		
		
		
		
		
		
		
		
		

  }
}
