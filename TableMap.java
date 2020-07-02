/**
 * 2020/06/23
 * Exercise in Hash tables class for looping through getting and setting keys
 * Created By: Nicholas Ruppel
 * Student ID: 26001904476
 * 
 */
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
public class TableMap {

	HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
	
	public TableMap(HashMap<String, Integer> hashmap_) {
		hashmap = hashmap_;
	}
	public void showMap() {
		String key;
		Set<String> set = hashmap.keySet();
		Iterator<String> iterator =set.iterator();
		while(iterator.hasNext()) {
			key = iterator.next();
			System.out.print(key + ":" + hashmap.get(key) + " ");
		}
		System.out.println();
		
	}
	public int len() {
		return hashmap.size();
	}
	public void set(String key, int value) {
		if(hashmap.containsKey(key)) {
			hashmap.replace(key, value);
		}
		else {
			hashmap.put(key, value);
		}
	}
	public int get(String key) {
		return hashmap.get(key);
	}
	public int pop(String key) {
		return hashmap.remove(key);
	}
}
