
public class PracticeofArray {
	public static void main(String[] args) {
//Que. 1 : 5 float & calculate their sum
	/*	float []  marks = {48.5f, 57, 32.8f, 97.4f, 60.33f};
		float sum = 0;
		for(float numbers: marks) {
			sum = sum + numbers;
		}
		System.out.println("The value of sum is "+sum);
	*/
		
//Que 2 :
		float []  mark = {48.5f, 57, 32.8f, 97.4f, 60.33f};
		float num=  97.4f;
		boolean isInArray = false;
		for(float element:mark) {
			if(num==element) {
				isInArray = true;
				break;
			}
		}
			if(isInArray) {
				System.out.println("Value is present");
			}
			else {
				
				System.out.println("Value is not present");
			}
			
//Que 3 :			
			
			float []  marks = {48.5f, 57, 32.8f, 97.4f, 60.33f};
			float sum = 0;
			for(float element:marks) {                                     // Use for-each loop
				sum = sum + element;
			}
			System.out.println("The value of average marks is:" + sum/marks.length);
			
//Que 4 :
			int[][] mat1= {{1, 2, 3},
					       {4, 5, 6}};
	  	    int[][] mat2 = {{2, 6, 13},
				           {3, 7, 1}};
	  	    int[][] result = {{0, 0, 0},
		                    {0, 0, 0}};
	  	    for(int i=0; i<mat1.length; i++) {
	  	    	for(int j=0; j<mat1[i].length; j++) {
	  	    		System.out.format("Setting value of i=%d and j=%d\n", i, j);
	  	    		result[i][j] = mat1[i][j] + mat2[i][j];
	  	    		
	  	    }
	  	  } 
//                   OR
	  	  for(int i=0; i<mat1.length; i++) {
	  	    	for(int j=0; j<mat1[i].length; j++) {
	  	    		System.out.print(result[i][j] + " ");                      // Easy method
	  	    		result[i][j] = mat1[i][j] + mat2[i][j]; 
	  	    }
	  	    	System.out.println(" ");
	  	  }
	  	         
		         
	  	         
	  	         
	  	         
	  	         
	 
	  	    
	  	    
	  	    
	  	    
	  	    
	  	    
	  	    
	}

}
