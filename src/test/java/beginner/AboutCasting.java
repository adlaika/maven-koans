package beginner;

import static util.KoanConstants.__;
import static org.testng.Assert.assertEquals;
import static org.testng.AssertJUnit.fail;

import org.testng.annotations.Test;

@SuppressWarnings("unused")
public class AboutCasting {

	@Test
	public void longPlusInt() {
		int a = 6;
		long b = 10;
		Object c = a + b;
		assertEquals(__, c);
		assertEquals(__, c instanceof Integer);
		assertEquals(__, c instanceof Long);
	}

	@Test
	public void forceIntTypecast() {
		long a = 2147483648L;
		// What happens if we force a long value into an int?
		int b = (int) a;
		assertEquals(__, b);
	}

	@Test
	public void implicitTypecast() {
		int a = 1;
		int b = Integer.MAX_VALUE;
		long c = a + b; // still overflows int... which is the Integer.MIN_VALUE, the operation occurs prior to assignment to long
		assertEquals(__, c);
	}

	interface Sleepable {
		String sleep();
	}

	class Grandparent implements Sleepable {
		public String sleep() {
			return "zzzz";
		}
	}

	class Parent extends Grandparent {
		public String complain() {
			return "TPS reports don't even have a cover letter!";
		}
	}

	class Child extends Parent {
		public String complain() {
			return "Are we there yet!!";
		}
	}

	@Test
	public void downCastWithInheritance() {
		Child child = new Child();
		Parent parentReference = child; // Why isn't there an explicit cast?
		assertEquals(__, child instanceof Child);
		assertEquals(__, parentReference instanceof Child);
		assertEquals(__, parentReference instanceof Parent);
		assertEquals(__, parentReference instanceof Grandparent);
	}

	@Test
	public void downCastAndPolymorphism() {
		Child child = new Child();
		Parent parentReference = child;
		// If the result is unexpected, consider the difference between an instance and its reference
		assertEquals(__, parentReference.complain());
	}

	@Test
	public void upCastWithInheritance() {
		Grandparent child = new Child();
		Parent parentReference = (Parent) child; // Why do we need an explicit cast here?
		Child childReference = (Child) parentReference; // Or here?
		assertEquals(__, childReference instanceof Child);
		assertEquals(__, childReference instanceof Parent);
		assertEquals(__, childReference instanceof Grandparent);
	}

	@Test
	public void upCastAndPolymorphism() {
		Grandparent child = new Child();
		Parent parent = (Child) child;
		// Think about the result. Did you expect that? Why?
		// How is that different from above?
		assertEquals(__, parent.complain());
	}

	@Test
	public void classCasting() {
		try {
			Object o = new Object();
			((Sleepable) o).sleep(); // would this even compile without the cast?
		} catch (ClassCastException x) {
			fail("Object does not implement Sleepable, maybe one of the people classes do?");
		}
	}

	@Test
	public void complicatedCast() {
		Grandparent parent = new Parent();
		// How can we access the parent's ability to "complain" - if the reference is held as a superclass?
		assertEquals(__, "TPS reports don't even have a cover letter!");
	}

}
