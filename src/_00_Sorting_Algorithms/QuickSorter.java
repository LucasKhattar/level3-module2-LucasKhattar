package _00_Sorting_Algorithms;

public class QuickSorter extends Sorter {
	public QuickSorter() {
		type = "Quick";
	}

	void sort(int[] array, SortingVisualizer display) {
		quickSort(array, 0, array.length - 1, display);
	}

	private void quickSort(int[] array, int low, int high, SortingVisualizer display) {
		int i = low;
		int j = high;
		int pivot = array[(low + high) / 2];
		while (i <= j) {
			while (array[i] < pivot) {
				i++;
			}
			while (array[j] > pivot) {
				j--;
			}
			if (i <= j) {
				int swapper = array[i];
				array[i] = array[j];
				array[j] = swapper;
				i += 1;
				j -= 1;
			}
		}
		if (low < j) {
			quickSort(array, low, j, display);
			display.updateDisplay();
		}
		if (high > i) {
			quickSort(array, i, high, display);
			display.updateDisplay();
		}
	}

}
