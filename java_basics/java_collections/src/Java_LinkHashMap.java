

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// It Implements the Map Interface and Also Maintain the Insertion Order
public class Java_LinkHashMap {

	public static void main(String[] args) {

		Map<String, Object> linkMap = new LinkedHashMap<>();

		linkMap.put("Name", "Java");
		linkMap.put("Version", "1.8");
		linkMap.put("Word", "is");
		linkMap.put("Adverb", "best");

		// Print LinkHashMap
		System.out.println(linkMap);

		Set<Entry<String, Object>> linkMaps = linkMap.entrySet();

		Iterator<Entry<String, Object>> i = linkMaps.iterator();

		while (i.hasNext()) {

			System.out.println(i.next());   // Insertion Order

		}

		// Remove the Key-Value using key
		linkMap.remove("Name");

		// Replace using Key Value
		linkMap.replace("Word", "was");

		// Check Empty Status
		boolean emptyStatus = linkMap.isEmpty();
		System.out.println(emptyStatus);

		// Set of key that contain by the Any type of Map
		Set<String> set = linkMap.keySet();
		System.out.println(set);

	}

}
