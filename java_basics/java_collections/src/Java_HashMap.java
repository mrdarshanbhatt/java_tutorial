
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// HashMap implements the map Interface , No any Maintain the Order
public class Java_HashMap {

	public static void main(String[] args) {

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("Name", "Java");
		map.put("Version", "1.8");
		map.put("Word", "is");
		map.put("Adverb", "best");

		// HashMap Allow One null Key and one or more Null Value
		map.put(null, null);
		map.put("NullKey", null);
		
		// Print map
		System.out.println(map);

		// print one by one
		// Set is Not iterate over for...each loop so use Entry set
		Set<Entry<String, Object>> maps = map.entrySet();

		Iterator<Entry<String, Object>> i = maps.iterator();

		while (i.hasNext()) {

			System.out.println(i.next()); // No any Order

		}

		// Get Value from the Map using Key Value
		Object name = map.get("Name");
		System.out.println(name);

		// Check Empty or not
		boolean emptyStatus = map.isEmpty();
		System.out.println(emptyStatus);

		// Replace value using key Value
		map.replace("Name", "Python");
		System.out.println(map);

		// More Method are Java Doc 1.8
	}

}
