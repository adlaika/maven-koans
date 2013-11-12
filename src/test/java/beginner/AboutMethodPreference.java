package beginner;

import org.testng.annotations.Test;
import static util.KoanConstants.__;
import static org.testng.Assert.assertEquals;

public class AboutMethodPreference {

	class A {
		public String doStuff(int i) { return "int"; }
		public String doStuff(Integer i) { return "Integer"; }
		public String doStuff(Object i) { return "Object"; }
		public String doStuff(int...i) { return "int vararg"; }
	}
	
	@Test
	public void methodPreferenceInt() {
		assertEquals(__, new A().doStuff(1));
	}

	@Test
	public void methodPreferenceInteger() {
		assertEquals(__, new A().doStuff(Integer.valueOf(1)));
	}
	
	@Test
	public void methodPreferenceLong() {
		long l = 1;
		assertEquals(__, new A().doStuff(l));
	}
	
	@Test
	public void methodPreferenceBoxedLong() {
		Long l = Long.valueOf(1);
		assertEquals(__, new A().doStuff(l));
	}
	
	@Test
	public void methodPreferenceDouble() {
		Double l = Double.valueOf(1);
		assertEquals(__, new A().doStuff(l));
	}

	@Test
	public void methodPreferenceMore() {
		// What happens if you change 'Integer' to 'Double'
		// Does this explain 'methodPreferenceDouble'?
		// Think about why this happens?
		assertEquals(__, new A().doStuff(1,Integer.valueOf(2)));
	}
}
