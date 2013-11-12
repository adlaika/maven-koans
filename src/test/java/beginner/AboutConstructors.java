package beginner;


import org.testng.annotations.Test;
import static util.KoanConstants.__;
import static org.testng.Assert.assertEquals;

public class AboutConstructors {

	class A {
		String someString = "a";
		public A() { someString+= "x"; }
		
	}
	
	class B extends A {
		public B() { someString += "g"; };
	}
	
	@Test
	public void simpleConstructorOrder(){
		assertEquals(__, new B().someString);
	}
	
	class Aa {
		String someString = "a";
		public Aa() { someString+= "x"; }
		public Aa(String s) {
			someString += s;
		}
	}
	
	class Bb extends Aa {
		public Bb() { super("Boo"); someString += "g"; };
	}
	
	@Test
	public void complexConstructorOrder(){
		assertEquals(__, new Bb().someString);
	}
	
}
