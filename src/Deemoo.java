import java.util.HashMap;

public class Deemoo {
	public static void main(String[] args) {
		
		HashMap<Integer,String> map = new HashMap<>();
		
		map.put(101,"Java");
		map.put(102,"SQL");
		map.put(103, null);
		map.put(102, "Java");                        // 101 key already exist, so HasHmap replace old value Java with new value SQL
		map.put(104, "Spring Boot");
		map.put(103, null);
		
		System.out.println(map);
		
		System.out.println(map.get(103));                        // get value using key
		System.out.println(map.get(104));
		
		System.out.println(map.keySet());                     //print all keys
		
		System.out.println(map.values());                     // print all values
	}

}
