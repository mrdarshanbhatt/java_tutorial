

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

// Tree map is Implements the map and SortedMap Interface
public class Java_TreeMap {

	public static void main(String[] args) {

		Map<String, Object> treeMap = new TreeMap<>();

		treeMap.put("Name", "Java");
		treeMap.put("Version", "1.8");
		treeMap.put("Word", "is");
		treeMap.put("Adverb", "best");

		// Print tree map
		System.out.println(treeMap);

		// Print one by one
		Set<Entry<String, Object>> treeMaps = treeMap.entrySet();

		Iterator<Entry<String, Object>> i = treeMaps.iterator();
		while (i.hasNext()) {

			System.out.println(i.next()); // Ascending Order..

		}

		// Remove the Key-Value using key
		treeMap.remove("Name");

		// Replace using Key Value
		treeMap.replace("Word", "was");

		// Check Empty Status
		boolean emptyStatus = treeMap.isEmpty();
		System.out.println(emptyStatus);

		// Set of key that contain by the Any type of Map
		Set<String> set = treeMap.keySet();
		System.out.println(set);

		// More Methods and Functionality are available in JavaDoc 1.8

	}

}
