package intermediate;

import static util.KoanConstants.__;
import static org.testng.Assert.assertEquals;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;

import org.testng.annotations.Test;


public class AboutCollections {
	
	@Test
	public void usingAnArrayList() {
		// List = interface
		// The generic syntax and special generic cases will be handled in
		// AboutGenerics. We just use <String> collections here to keep it
		// simple.
		List<String> list = new ArrayList<String>();
					// ArrayList: simple List implementation
		list.add("Chicken");
		list.add("Dog");
		list.add("Chicken");
		assertEquals(__, list.get(0));
		assertEquals(__, list.get(1));
		assertEquals(__, list.get(2));
	}
	
	@Test
	public void usingAQueue() {
		// Queue = interface 
		Queue<String> queue = new PriorityQueue<String>();
					// PriorityQueue: simple queue implementation
		queue.add("Cat");
		queue.add("Dog");
		assertEquals(__, queue.peek());
		assertEquals(__, queue.size());
		assertEquals(__, queue.poll());
		assertEquals(__, queue.size());
		assertEquals(__, queue.poll());
		assertEquals(__, queue.isEmpty());
	}
	
	@Test
	public void usingABasicSet() {
		Set<String> set = new HashSet<String>();
		set.add("Dog");
		set.add("Cat");
		set.add("Dog");
		assertEquals(__, set.size());
		assertEquals(__, set.contains("Dog"));
		assertEquals(__, set.contains("Cat"));
		assertEquals(__, set.contains("Chicken"));
	}
	
	@Test
	public void usingABasicMap() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("first key", "first value");
		map.put("second key", "second value");
		map.put("first key", "other value");
		assertEquals(__, map.size());
		assertEquals(__, map.containsKey("first key"));
		assertEquals(__, map.containsKey("second key"));
		assertEquals(__, map.containsValue("first value"));
		assertEquals(__, map.get("first key"));
	}
	
	@Test
	public void usingBackedArrayList() {
		String[] array = {"a","b","c"};
		List<String> list = Arrays.asList(array);
		list.set(0, "x");
		assertEquals(__, array[0]);
		array[0] = "a";
		assertEquals(__, list.get(0));
		// Just think of it as quantum state teleportation...
	}
	
	@Test
	public void usingBackedSubMap() {
		TreeMap<String, String> map = new TreeMap<String, String>();
		map.put("a", "Aha");
		map.put("b", "Boo");
		map.put("c", "Coon");
		map.put("e", "Emu");
		map.put("f", "Fox");
		SortedMap<String, String> backedMap = map.subMap("c", "f");
		assertEquals(__, backedMap.size());
		assertEquals(__, map.size());
		backedMap.put("d", "Dog");
		assertEquals(__, backedMap.size());
		assertEquals(__, map.size());
		assertEquals(__, map.containsKey("d"));
		// Again: backed maps are just like those little quantum states 
		// that are connected forever...
	}
	
	@Test
	public void differenceBetweenOrderedAndSorted() {
		TreeSet<String> sorted = new TreeSet<String>();
		sorted.add("c");
		sorted.add("z");
		sorted.add("a");
		assertEquals(__, sorted.first());
		assertEquals(__, sorted.last());
		// Look at the different constructors for a TreeSet (or TreeMap)
		// Ponder how you might influence the sort order. Hold that thought
		// until you approach AboutComparison
		
		LinkedHashSet<String> ordered = new LinkedHashSet<String>();
		ordered.add("c");
		ordered.add("z");
		ordered.add("a");
		StringBuffer sb = new StringBuffer();
		for(String s: ordered) {
			sb.append(s);
		}
		assertEquals(__, sb.toString());
	}
}
