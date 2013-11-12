package intermediate;

import static util.KoanConstants.__;
import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class AboutAutoboxing {

	@Test
	public void addPrimitivesToCollection() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(0, new Integer(42));
		assertEquals(__, list.get(0));
	}
	
	@Test
	public void addPrimitivesToCollectionWithAutoBoxing() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(0, 42);
		assertEquals(__, list.get(0));
	}
	
	@Test
	public void migrateYourExistingCodeToAutoBoxingWithoutFear() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(0, new Integer(42));
		assertEquals(__, list.get(0));

		list.add(1, 84);
		assertEquals(__, list.get(1));
	}
	
	@Test
	public void allPrimitivesCanBeAutoboxed() {
		List<Double> doubleList = new ArrayList<Double>();
		doubleList.add(0, new Double(42));
		assertEquals(__, doubleList.get(0));

		List<Long> longList = new ArrayList<Long>();
		longList.add(0, new Long(42));
		assertEquals(__, longList.get(0));

		List<Character> characterList = new ArrayList<Character>();
		characterList.add(0, new Character('z'));
		assertEquals(__, characterList.get(0));
	}
	
}
