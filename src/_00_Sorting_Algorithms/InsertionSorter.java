package _00_Sorting_Algorithms;

public class InsertionSorter extends Sorter {
	public InsertionSorter() {
		type = "Insertion";
	}
	void sort(int[] array, SortingVisualizer display) {		
		for (int i = 1; i < array.length; i++) {
			for (int j = i; j > 0; j--) {
				if(array[j]<array[j-1]) {
					int a = array[j];
					array[j] = array[j-1];
					array[j-1] = a;
					display.updateDisplay();
				}
			}
		}
	}
}
