class Demo1 extends Thread{
	public void run() {
		
		for(int i=0; i<=10; i++) {
			System.out.println(i);
		}
	}
}

 class Demo2 implements Runnable{
	 public void run() {
		 
		 for(int i=0; i<=10; i++) {
			 System.out.println(i);
		 }
	 }
	 
 }	 
 class MultiThreading {
	public static void main(String[] args) {
		Demo2 d1 = new Demo2();
		Thread T1 = new Thread(d1);
		Thread T2 = new Thread(d1);
		
		T1.start();
		T2.start();
		
	}
}


	

