import java.util.ArrayList;
import java.util.Collections;

public class Demo0 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		System.out.println(list);
		
		for(int i=0; i<list.size(); i++) {                              // using loop print element
			System.out.println(list.get(i));
		}
		
		System.out.println("Size is : "+ list.size());
		
		list.set(3,70);                                                 // update element
		System.out.println(list);
		
		list.remove(4);
		System.out.println(list);
		
		Collections.sort(list);                                       // increcing order
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println(list);
		
		System.out.println(Collections.max(list));                    // maximum element
		
		System.out.println(Collections.min(list));                    // minimum element
		
		System.out.println(list.contains(30));                            // check element 
	}

}
