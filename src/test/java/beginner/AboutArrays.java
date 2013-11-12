package beginner;

import static org.testng.Assert.assertEquals;
import static util.KoanConstants.*;

import java.util.Arrays;

import org.testng.annotations.Test;

public class AboutArrays {

	@Test
	public void arraysDoNotConsiderElementsWhenEvaluatingEquality(){
		// arrays utilize default object equality (A == {1} B == {1}, though A
		// and B contain the same thing, the container is not the same
		// referenced array instance...
		assertEquals( __, new int[] { 1 }.equals(new int[] { 1 }));
	}
	
	@Test
	public void cloneEqualityIsNotRespected(){ //!
		int[] original = new int[] { 1 };
		assertEquals( __, original.equals(original.clone()));
	}
	
	@Test
	public void anArraysHashCodeMethodDoesNotConsiderElements(){
		int[] array0 = new int[]{0};
		int[] array1 = new int[]{0};
		assertEquals( __, Integer.valueOf(array0.hashCode()).equals(array1.hashCode())); // not equal!
		// TODO: ponder the consequences when arrays are used in Hash Collection implementations.
	}
	
	@Test
	public void arraysHelperClassEqualsMethodConsidersElementsWhenDeterminingEquality(){
		int[] array0 = new int[]{0};
		int[] array1 = new int[]{0};
		assertEquals(__, Arrays.equals(array0, array1)); 	// whew - what most people assume
		 													// about equals in regard to arrays! (logical equality)
	}

	@Test
	public void arraysHelperClassHashCodeMethodConsidersElementsWhenDeterminingHashCode(){
		int[] array0 = new int[]{0};
		int[] array1 = new int[]{0};
		// whew - what most people assume about hashCode in regard to arrays!
		assertEquals( __, Integer.valueOf(Arrays.hashCode(array0)).equals(Arrays.hashCode(array1)));
	}
	
	@Test
	public void arraysAreMutable(){
		final boolean[] oneBoolean = new boolean[]{false};
		oneBoolean[0] = true;
		assertEquals( __, oneBoolean[0]);
	}
	
	@Test
	public void arraysAreIndexedAtZero(){
		int[] integers = new int[]{1,2};
		assertEquals( __, integers[0]);
		assertEquals( __, integers[1]);
	}
	
	@Test
	public void arrayIndexOutOfBounds(){
		int[] array = new int[]{1};
		@SuppressWarnings("unused")
		int meh = array[1]; // remember 0 based indexes, 1 is the 2nd element (which doesn't exist)
	}
	
	@Test
	public void arrayLengthCanBeChecked(){
		assertEquals( __, new int[1].length);
	}
	
}
