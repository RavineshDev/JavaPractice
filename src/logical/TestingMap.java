package logical;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TestingMap {
	
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("rajeev", "shop");
		map.put("kavi", "poet");
		
		map.values().stream().filter(x -> x.equals("shop")).forEach(System.out::println);
		
		for(Map.Entry<String, String> ent:map.entrySet()) {
			
			System.out.println(ent.getKey()+" , "+ent.getValue());
		}
	}

}
