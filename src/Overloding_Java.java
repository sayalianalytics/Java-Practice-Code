class Bank{
	public float interest(int amount) {              // 1st method
		float Ret = 0.0f;
		Ret = amount * 0.10f;
		return Ret;
	}
	
	public float interest(int amount, float Rate) {                 // 2nd method
		float Ret = 0.0f;
		Ret = amount * (Rate/100);
		return Ret;
	}
	
	public float interest(int amount, float Rate, boolean type) {        //  3rd method
		float Ret = 0.0f;
	    Ret = this.interest(amount, Rate);
	    
	    if(type==false) {
	    	return Ret;
	    }
	    else {
	    	Ret = Ret + (amount * 0.01f);
	    	return Ret;
	    }
	}
	
	public float interest(int amount, float Rate, String nationality) {          // 4th method
		float Ret = 0.0f;
		 Ret = this.interest(amount, Rate);
		 
		 if(nationality=="Indian") {
			 return Ret;
		 }
		 else if(nationality=="NRI") {
			 return(Ret/2);
		 }
		 return Ret;
	}
}
public class Overloding_Java {
	public static void main(String[] args) {
		Bank bobj = new Bank();
		float Fans = 0.0f;
		
		Fans = bobj.interest(10000);
		System.out.println(Fans);
		
		Fans = bobj.interest(10000, 9.7f);
		System.out.println(Fans);
		
		Fans = bobj.interest(25000, 9.8f, true);
		System.out.println(Fans);
		
		Fans = bobj.interest(27000, 11.0f,"NRI");
		System.out.println(Fans);
		
	}
	

}
