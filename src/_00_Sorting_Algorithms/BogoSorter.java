package _00_Sorting_Algorithms;

import java.util.Random;

public class BogoSorter extends Sorter {
	public BogoSorter() {
		type = "Bogo";
	}

	boolean sorted = false;

	void sort(int[] array, SortingVisualizer display) {
		while (!sorted) {
			Random rand = new Random();
			int one = rand.nextInt(array.length);
			int two = rand.nextInt(array.length);
			int swapper = array[one];
			array[one] = array[two];
			array[two] = swapper;
			display.updateDisplay();
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					sorted = false;
					break;
				} else {
					sorted = true;
				}
			}
		}
	}
}
