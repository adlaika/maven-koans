package beginner;

// FYI - usually bad practice to import statically, but can make code cleaner
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertSame;
import static org.testng.Assert.assertTrue;
import static util.KoanConstants.__;
import static org.testng.Assert.assertEquals;


import org.testng.annotations.Test;

public class AboutAssertions {

	@Test
	public void assertBooleanTrue() {
		assertTrue((Boolean)__); // should be true really
	}

	@Test
	public void assertBooleanFalse() {
		assertFalse((Boolean)__);
	}
	
	@Test
	public void assertNullObject(){
		assertNull(__);
	}
	
	@Test
	public void assertNotNullObject(){
		assertNotNull(null); // anything other than null should pass here...
	}

	@Test
	public void assertEqualsUsingExpression(){
		assertTrue("Hello World!".equals(__));
	}

	@Test
	public void assertEqualsWithBetterFailureMessage(){
		assertEquals(__, 1);
	}

	@Test
	public void assertEqualsWithDescriptiveMessage() {
		// Generally, when using an assertXXX testNg methods, expectation is on the
		// right and it is best practice to use a String for the last arg
		// indicating what has failed
		assertEquals(__, 42, "The answer to 'life the universe and everything' should be 42");
	}
	
	@Test
	public void assertSameInstance(){
		Object same				= new Integer(1);
		Object sameReference	= __;
		assertSame(sameReference, same);
	}
	
	@Test
	public void assertNotSameInstance(){
		Integer same           = new Integer(1);
		Integer sameReference  = same;
        assertSame(sameReference, same);
    }
}
