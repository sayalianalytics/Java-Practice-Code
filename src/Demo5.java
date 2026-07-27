import java.util.LinkedList;

public class Demo5 {
	public static void main(String[] args) {
//		 LinkedList<String> list = new LinkedList<>();
//		   
//		 list.add("Java");
//		 list.add("SQL");
//		 list.add("Spring Boot");
//		 
//		 System.out.println(list);
//		 
		
		LinkedList<Integer> list = new LinkedList<>();
		 
		list.add(30);
		list.add(60);
		list.add(70);
		list.add(20);
		
		System.out.println(list);
		
		System.out.println("First :" + list.getFirst());
		System.out.println("Last :" + list.getLast());
		
		list.removeLast();
		System.out.println(list);
		 
	}

}
