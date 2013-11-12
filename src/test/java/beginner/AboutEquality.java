package beginner;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static util.KoanConstants.__;

public class AboutEquality {

	@Test
	public void doubleEqualsTestsIfTwoObjectsAreTheSame(){
		Object object = new Object();
		Object sameObject = object;
		assertEquals(__, object == sameObject);
		assertEquals(__, object == new Object());
	}

	@Test
	public void equalsMethodByDefaultTestsIfTwoObjectsAreTheSame(){
		Object object = new Object();
		assertEquals(__, object.equals(object));
		assertEquals(__, object.equals(new Object()));
	}

	@Test
	public void equalsMethodCanBeChangedBySubclassesToTestsIfTwoObjectsAreEqual(){
		Object object = new Integer(1);
		assertEquals(__, object.equals(object));
		assertEquals(__, object.equals(new Integer(1)));
		// Note: This means that for the class 'Object' there is no difference between 'equal' and 'same'
	}

	@Test
	public void objectsNeverEqualNull(){
		assertEquals(__, new Object().equals(null));
	}

	@Test
	public void objectsEqualThemselves(){
		Object obj = new Object();
		assertEquals(__, obj.equals(obj));
	}
}
