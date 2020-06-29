package interviewPrograms;
import java.util.HashMap;
import java.util.Map;

public class DuplicateCharactersString {

	public static void main(String[] args) {
		String str = "Better Butter";
		HashMap<Character,Integer> map = new HashMap<>();
		for(int i=0;i<str.length();i++) {
			if(!map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i),1);
			} else {
				int value = map.get(str.charAt(i));
				map.replace(str.charAt(i),value+1);
			}
		}
		for(Map.Entry<Character,Integer> entry:map.entrySet()) {
			if(entry.getValue()!=1) {
				System.out.print(entry.getKey()+" ");
			}
		}
	}
}
