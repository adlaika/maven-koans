package beginner;

import org.testng.annotations.Test;
import static util.KoanConstants.__;
import static org.testng.Assert.assertEquals;

public class AboutEnums {


	enum Colors {
		Red, Blue, Green, Yellow // what happens if you add a ; here?
		// What happens if you type Red() instead?
	}
	
	@Test
	public void basicEnums() {
		Colors blue = Colors.Blue;
		assertEquals(__, blue == Colors.Blue);
		assertEquals(__, blue == Colors.Red);
		assertEquals(__, blue instanceof Colors);
	}
	
	@Test
	public void basicEnumsAccess() {
		Colors[] colorArray = Colors.values();
		assertEquals(__, colorArray[2]);
	}
	
	enum SkatSuits {
		Clubs(12), Spades(11), Hearts(10), Diamonds(9);
		SkatSuits(int v) { value = v; }
		private int value;
	}
	
	@Test
	public void enumsWithAttributes() {
		// value is private but we still can access it. Why?
		// Try moving the enum outside the AboutEnum class... What do you expect?
		// What happens?
		assertEquals(__, SkatSuits.Clubs.value > SkatSuits.Spades.value);
	}
	
	enum OpticalMedia {
		CD(650), DVD(4300), BluRay(50000);
		OpticalMedia(int c) {
			capacityInMegaBytes = c;
		}
		int capacityInMegaBytes;
		int getCoolnessFactor() {
			return (capacityInMegaBytes - 1000) * 10;
		}
	}
	
	@Test
	public void enumsWithMethods() {
		assertEquals(__, OpticalMedia.CD.getCoolnessFactor());
		assertEquals(__, OpticalMedia.BluRay.getCoolnessFactor());
	}
}
