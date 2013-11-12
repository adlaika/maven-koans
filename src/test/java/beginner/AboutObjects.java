package beginner;

import static util.KoanConstants.__;
import static org.testng.Assert.assertEquals;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class AboutObjects {

	@Test
	public void newObjectInstancesCanBeCreatedDirectly() {
		assertEquals(__, new Object() instanceof Object);
	}

	@Test
	public void allClassesInheritFromObject() {
		class Foo {}

		Class<?>[] ancestors = getAncestors(new Foo());
		assertEquals(__, ancestors[0]);
		assertEquals(__, ancestors[1]);
	}

	@Test
	public void objectToString() {
		Object object = new Object();
		// TODO: Why is it best practice to ALWAYS override toString?
		String expectedToString = MessageFormat.format("{0}@{1}", Object.class.getName(), Integer.toHexString(object.hashCode()));
		assertEquals(__, expectedToString); // hint: object.toString()
	}

	@Test
	public void toStringConcatenates(){
		final String string = "ha";
		Object object = new Object(){
			@Override public String toString(){
				return string;
			}
		};
		assertEquals(__, string + object);
	}

	@Test
	public void toStringIsTestedForNullWhenInvokedImplicitly(){
		String string = "string";
		assertEquals(__, string+null);
	}

	private Class<?>[] getAncestors(Object object) {
		List<Class<?>> ancestors = new ArrayList<Class<?>>();
		Class<?> clazz = object.getClass();
		while(clazz != null) {
			ancestors.add(clazz);
			clazz = clazz.getSuperclass();	
		}
		return ancestors.toArray(new Class[]{});	
	}
	
}
