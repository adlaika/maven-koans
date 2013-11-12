package beginner;

import static util.KoanConstants.__;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class AboutPrimitives {

	@Test
	public void wholeNumbersAreOfTypeInt() {
		assertEquals(__, getType(1)); // hint: int.class
	}

	@Test
	public void primitivesOfTypeIntHaveAnObjectTypeInteger() {
		Object number = 1;
		assertEquals(__, getType(number));

		// Primitives can be automatically changed into their object type via a process called auto-boxing
		// We will explore this in more detail in intermediate.AboutAutoboxing
	}

	@Test
	public void integersHaveAFairlyLargeRange() {
		assertEquals(__, Integer.MIN_VALUE);
		assertEquals(__, Integer.MAX_VALUE);
	}

	@Test
	public void integerSize() {
		assertEquals(__, Integer.SIZE);  // This is the amount of bits used to store an int
	}

	@Test
	public void wholeNumbersCanAlsoBeOfTypeLong() {
		assertEquals(__, getType(1l));
	}

	@Test
	public void primitivesOfTypeLongHaveAnObjectTypeLong() {
		Object number = 1l;
		assertEquals(__, getType(number));
	}

	@Test
	public void longsHaveALargerRangeThanInts() {
		assertEquals(__, Long.MIN_VALUE);
		assertEquals(__, Long.MAX_VALUE);
	}

	@Test
	public void longSize() {
		assertEquals(__, Long.SIZE);
	}

	@Test
	public void wholeNumbersCanAlsoBeOfTypeShort() {
		assertEquals(__, getType((short) 1)); // The '(short)' is called an explicit cast - to type 'short'
	}

	@Test
	public void primitivesOfTypeShortHaveAnObjectTypeShort() {
		Object number = (short) 1;
		assertEquals(__, getType(number));
	}

	@Test
	public void shortsHaveASmallerRangeThanInts() {
		assertEquals(__, Short.MIN_VALUE);  // hint: You'll need an explicit cast
		assertEquals(__, Short.MAX_VALUE);
	}

	@Test
	public void shortSize() {
		assertEquals(__, Short.SIZE);
	}

	@Test
	public void wholeNumbersCanAlsoBeOfTypeByte() {
		assertEquals(__, getType((byte) 1));
	}

	@Test
	public void primitivesOfTypeByteHaveAnObjectTypeByte() {
		Object number = (byte) 1;
		assertEquals(__, getType(number));
	}

	@Test
	public void bytesHaveASmallerRangeThanShorts() {
		assertEquals(__, Byte.MIN_VALUE);
		assertEquals(__, Byte.MAX_VALUE);

		// Why would you use short or byte considering that you need to do explicit casts?
	}

	@Test
	public void byteSize() {
		assertEquals(__, Byte.SIZE);
	}

	@Test
	public void wholeNumbersCanAlsoBeOfTypeChar() {
		assertEquals(__, getType((char) 1));
	}

	@Test
	public void singleCharactersAreOfTypeChar() {
		assertEquals(__, getType('a'));
	}

	@Test
	public void primitivesOfTypeCharHaveAnObjectTypeCharacter() {
		Object number = (char) 1;
		assertEquals(__, getType(number));
	}

	@Test
	public void charsCanOnlyBePositive() {
		assertEquals(__, (int) Character.MIN_VALUE);
		assertEquals(__, (int) Character.MAX_VALUE);

		// Why did we cast MIN_VALUE and MAX_VALUE to int? Try it without the cast.
	}

	@Test
	public void charSize() {
		assertEquals(__, Character.SIZE);
	}

	@Test
	public void decimalNumbersAreOfTypeDouble() {
		assertEquals(__, getType(1.0));
	}

	@Test
	public void primitivesOfTypeDoubleCanBeDeclaredWithoutTheDecimalPoint() {
		assertEquals(__, getType(1d));
	}

	@Test
	public void primitivesOfTypeDoubleCanBeDeclaredWithExponents() {
		assertEquals(__, getType(1e3));
		assertEquals(__, 1.0e3);
		assertEquals(__, 1E3);
	}

	@Test
	public void primitivesOfTypeDoubleHaveAnObjectTypeDouble() {
		Object number = 1.0;
		assertEquals(__, getType(number));
	}

	@Test
	public void doublesHaveALargeRange() {
		assertEquals(__, Double.MIN_VALUE);
		assertEquals(__, Double.MAX_VALUE);
	}

	@Test
	public void doubleSize() {
		assertEquals(__, Double.SIZE);
	}

	@Test
	public void decimalNumbersCanAlsoBeOfTypeFloat() {
		assertEquals(__, getType(1f));
	}

	@Test
	public void primitivesOfTypeFloatCanBeDeclaredWithExponents() {
		assertEquals(__, getType(1e3f));
		assertEquals(__, 1.0e3f);
		assertEquals(__, 1E3f);
	}

	@Test
	public void primitivesOfTypeFloatHaveAnObjectTypeFloat() {
		Object number = 1f;
		assertEquals(__, getType(number));
	}

	@Test
	public void floatsHaveASmallerRangeThanDoubles() {
		assertEquals(__, Float.MIN_VALUE);
		assertEquals(__, Float.MAX_VALUE);
	}

	@Test
	public void floatSize() {
		assertEquals(__, Float.SIZE);
	}

	private Class<?> getType(int value) {
		return int.class;
	}

	private Class<?> getType(long value) {
		return long.class;
	}

	private Class<?> getType(float value) {
		return float.class;
	}

	private Class<?> getType(double value) {
		return double.class;
	}

	private Class<?> getType(byte value) {
		return byte.class;
	}

	private Class<?> getType(char value) {
		return char.class;
	}

	private Class<?> getType(short value) {
		return short.class;
	}

	private Class<?> getType(Object value) {
		return value.getClass();
	}
	
}
