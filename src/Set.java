import java.util.HashSet;

public class Set {
	public static void main(String[] args) {
//		HashSet<Integer> set = new HashSet<>();
//		
//		set.add(40);
//		set.add(30);
//		set.add(90);
//		set.add(30);
//		set.add(40);                               // Duplicate element are not allowed
//		
//		System.out.println(set);
//		
		
		HashSet<String> set = new HashSet<>();
		
		set.add("Java");
		set.add(null);
		set.add(null);
		set.add("Java");
		
		System.out.println(set);                      // one null value allowed
		
		
	}

}
