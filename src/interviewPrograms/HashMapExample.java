package interviewPrograms;
import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap<>();
		print(map);
		map.put("Sherlock",35);
		map.put("John",32);
		map.put("Mary",30);
		print(map);
		if(map.containsKey("John")) {
			Integer age = map.get("John");
			System.out.println("John's age is "+age);
		}
		map.remove("John");
		print(map);
		map.clear();
		print(map);
	}
	public static void print(HashMap<String,Integer> map) {
		if(map.isEmpty()) {
			System.out.println("Map is Empty");
		} else {
			System.out.println(map);
		}
	}

}
