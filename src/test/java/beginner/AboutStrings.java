package beginner;

import org.testng.annotations.Test;

import java.text.MessageFormat;

import static org.testng.Assert.assertEquals;
import static org.testng.AssertJUnit.fail;
import static util.KoanConstants.*;


public class AboutStrings {

	@Test
	public void implicitStrings() {
		assertEquals(__, "just a plain ole string".getClass());
	}

	@Test
	public void newString() {
		// very rarely if ever should Strings be created via new String() in 
		// practice - generally it is redundant, and done repetitively can be slow
		String string = new String();
		String empty = "";
		assertEquals(__, string.equals(empty));
	}

	@Test
	public void newStringIsRedundant() {
		String stringInstance = "zero";
		String stringReference = new String(stringInstance);
		assertEquals(__, stringInstance.equals(stringReference));
	}

	@Test
	public void newStringIsNotIdentical() {
		String stringInstance = "zero";
		String stringReference = new String(stringInstance);
		assertEquals(__, stringInstance == stringReference);
	}

	@Test
	public void stringConcatenation() {
		String one = "one";
		String space = " ";
		String two = "two";
		assertEquals(__, one + space + two);
	}

	@Test
	public void stringBuilderCanActAsAMutableString() {
		// StringBuilder concatenation looks uglier, but is useful when you need a
		// mutable String like object. It used to be more efficient than using +
		// to concatate numerous strings, however this is optimized in the compiler now.
		// Usually + concatenation is more appropriate than StringBuilder.
		assertEquals(__, new StringBuilder("one").append(" ").append("two").toString());
	}

	@Test
	public void readableStringFormattingWithStringFormat() {
		assertEquals(__, String.format("%s %s %s", "a", "b", "a"));
	}

	@Test
	public void extraArgumentsToStringFormatGetIgnored() {
		assertEquals(__, String.format("%s %s %s", "a", "b", "c", "d"));
	}

	@Test
	public void insufficientArgumentsToStringFormatCausesAnError() {
		try {
			String.format("%s %s %s", "a", "b");
			fail("No Exception was thrown!");
		} catch (Exception e) {
			assertEquals(__, e.getClass());
			assertEquals(__, e.getMessage());
		}
	}

	@Test
	public void readableStringFormattingWithMessageFormat() {
		assertEquals(__, MessageFormat.format("{0} {1} {0}", "a", "b"));
	}

	@Test
	public void extraArgumentsToMessageFormatGetIgnored() {
		assertEquals(__, MessageFormat.format("{0} {1} {0}", "a", "b", "c"));
	}

	@Test
	public void insufficientArgumentsToMessageFormatDoesNotReplaceTheToken() {
		assertEquals(__, MessageFormat.format("{0} {1} {0}", "a"));
	}

}
