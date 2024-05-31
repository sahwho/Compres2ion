import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class CompressPublicTests {

	@Test
	public void testCompress1Public1() {
		char[] chars = {'a'};
		assertEquals("a", Compres2ion.compress1(chars));
	}

	@Test
	public void testCompress1Public2() {
		char[] chars = {'b', 'b', 'b'};
		assertEquals("b3", Compres2ion.compress1(chars));
	}

	@Test
	public void testCompress1Public3() {
		char[] chars = {'a', 'b', 'c', 'c', 'c'};
		assertEquals("abc3", Compres2ion.compress1(chars));
	}

	@Test
	public void testCompress2Public1() {
		char[] chars = {'a'};
		char[] expectedResult = {'a'};
		assertEquals(1, Compres2ion.compress2(chars));
		assertTrue(Arrays.equals(expectedResult, chars));
	}

	@Test
	public void testCompress2Public2() {
		char[] chars = {'b', 'b', 'b'};
		char[] expectedResult = {'b', '3', ' '};
		assertEquals(2, Compres2ion.compress2(chars));
		assertTrue(Arrays.equals(expectedResult, chars));
	}

	@Test
	public void testCompress2Public3() {
		char[] chars = {'a', 'b', 'c', 'c', 'c'};
		char[] expectedResult = {'a', 'b', 'c', '3', ' '};
		assertEquals(4, Compres2ion.compress2(chars));
		assertTrue(Arrays.equals(expectedResult, chars));
	}
}
