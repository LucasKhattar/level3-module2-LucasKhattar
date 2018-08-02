package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD

	@Test
	void testLinearSearch() {
		String[] arr = { "Bob", "Lisa", "Greg" };
		assertEquals(2, _00_LinearSearch.linearSearch(arr, "Greg"));
		assertEquals(0, _00_LinearSearch.linearSearch(arr, "Bob"));
		assertEquals(1, _00_LinearSearch.linearSearch(arr, "Lisa"));
		assertEquals(-1, _00_LinearSearch.linearSearch(arr, "Paul"));
	}

	@Test
	void testBinarySearch() {
		int[] arr = { 0, 1, 2, 3, 4, 5 };
		assertEquals(0, _01_BinarySearch.binarySearch(arr, 0, arr.length-1, 0));
		assertEquals(1, _01_BinarySearch.binarySearch(arr, 0, arr.length-1, 1));
		assertEquals(-1, _01_BinarySearch.binarySearch(arr, 0, arr.length-1, 10));
	}

	@Test
	void testInterpolationSearch() {
		int[] arr = { 0, 1, 2, 3, 4, 5};
		assertEquals(2, _02_InterpolationSearch.interpolationSearch(arr, 2));
		assertEquals(-1, _02_InterpolationSearch.interpolationSearch(arr, 6));
		assertEquals(5, _02_InterpolationSearch.interpolationSearch(arr, 5));
	}

	@Test
	void testExponentialSearch() {
		int[] arr = { 0, 3, 4, 6, 7, 9 };
		assertEquals(0, _03_ExponentialSearch.exponentialSearch(arr, 0));
		assertEquals(4, _03_ExponentialSearch.exponentialSearch(arr, 7));
		assertEquals(-1, _03_ExponentialSearch.exponentialSearch(arr, 10));
	}
}
