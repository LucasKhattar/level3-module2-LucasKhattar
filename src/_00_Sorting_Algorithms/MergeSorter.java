package _00_Sorting_Algorithms;

public class MergeSorter extends Sorter {
	public MergeSorter() {
		type = "Merge";
	}

	void sort(int[] array, SortingVisualizer display) {
		mergeSort(array, 0, array.length - 1, display);
	}

	private void mergeSort(int[] array, int low, int high, SortingVisualizer display) {
		int[] temp = new int[array.length];
		if (low < high) {
			int middle = (low + high) / 2;
			mergeSort(array, low, middle, display);
			mergeSort(array, middle + 1, high, display);
			for (int i = low; i <= high; i++) {
				temp[i] = array[i];
			}
			
			int i = low;
			int j = middle + 1;
			int k = low;
			
			while (i <= middle && j <= high) {
				if (temp[i] <= temp[j]) {
					array[k] = temp[i];
					i += 1;
				} else {
					array[k] = temp[j];
					j += 1;
				}
				k += 1;
				display.updateDisplay();

			}

			while (i <= middle) {

				array[k] = temp[i];

				k += 1;
				i += 1;
				display.updateDisplay();
			}
		}

	}

}
