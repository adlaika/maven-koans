package beginner;


import org.testng.annotations.Test;
import static util.KoanConstants.__;
import static org.testng.Assert.assertEquals;


public class AboutConditionals {

	@Test
	public void basicIfWithoutCurly(){
		// Ifs without curly braces are ugly and not recommended but still valid:
		int x = 1;
		if (true) 
			x++;
		assertEquals(__,x);
	}
	
	@Test
	public void basicIfElseWithoutCurly(){
		// Ifs without curly braces are ugly and not recommended but still valid:
		int x = 1;
		boolean secretBoolean = false;
		if (secretBoolean) 
			x++;
		else
			x--;
        assertEquals(__,x);
	}
	
	@Test
	public void basicIfElseIfElseWithoutCurly(){
		int x = 1;
		boolean secretBoolean = false;
		boolean otherBooleanCondition = true;
		// Ifs without curly braces are ugly and not recommended but still valid:
		if (secretBoolean) 
			x++;
		else if (otherBooleanCondition)
			x = 10;
		else
			x--;
        assertEquals(__,x);
	}
	
	@Test
	public void nestedIfsWithoutCurlysAreReallyMisleading() {
		// Why are these ugly you ask? Well, try for yourself
		int x = 1;
		boolean secretBoolean = false;
		boolean otherBooleanCondition = true;
		// Ifs without curly braces are ugly and not recommended but still valid:
		if (secretBoolean)  x++;
			if (otherBooleanCondition) x = 10;
		else x--;
		// Where does this else belong to!?
        assertEquals(__,x);
	}
	
	@Test
	public void ifAsIntended() {
		boolean secretBoolean = true;
		int x = 1;
		if(secretBoolean) {
			x++;
		} else {
			x = 0;
		}
		// There are different opinions on where the curly braces go...
		// But as long as you put them here. You avoid problems as seen above.
        assertEquals(__,x);
	} 
	
	@Test
	public void basicSwitchStatement() {
		int i = 1;
		String result = "Basic ";
		switch(i) {
			case 1:
				result += "One";
				break;
			case 2:
				result += "Two";
				break;
			default:
				result += "Nothing";
		}
		assertEquals(__, result);
	}
	
	@Test
	public void switchStatementFallThrough() {
		int i = 1;
		String result = "Basic ";
		switch(i) {
			case 1:
				result += "One";
			case 2:
				result += "Two";
			default:
				result += "Nothing";
		}
		assertEquals(__, result);
	}
	
	@Test
	public void switchStatementCrazyFallThrough() {
		int i = 5;
		String result = "Basic ";
		switch(i) {
			case 1:
				result += "One";
			default:
				result += "Nothing";
			case 2:
				result += "Two";
		}
		assertEquals(__, result);
	}
	
	@Test
	public void switchStatementConstants() {
		int i = 5;
		// What happens if you remove the 'final' modifier?
		// What does this mean for case values?
		final int caseOne = 1;
		String result = "Basic ";
		switch(i) {
			case caseOne:
				result += "One";
				break;
			default:
				result += "Nothing";
		}
        assertEquals(__, result);
	}
	
	@Test
	public void switchStatementSwitchValues() {
		// Try different (primitive) types for 'c'
		// Which types do compile?
		// Does boxing work?
		byte c = 'a';
		String result = "Basic ";
		switch(c) {
			case 'a':
				result += "One";
				break;
			default:
				result += "Nothing";
		}
		assertEquals(__, result);
	}
}
