interface Payment{
	void pay();
}

class GooglePay implements Payment{
	public void pay() {
		System.out.println("Payment using Google Pay");
	}
}

//class PhonePay implements Payment{
//	public void pay() {
//		System.out.println("Payment using Phone Pay");
//	}
//}
public class interface_eg2 {
	public static void main(String[] args) {
//		GooglePay GPay = new GooglePay();
//		PhonePay PPay = new PhonePay();          // using class reference 
//		GPay.pay();
//		PPay.pay();
		
		Payment p = new GooglePay();            // using interface reference 
		p.pay();
	}

}
