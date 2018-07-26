package _00_Sorting_Algorithms;

public class BubbleSorter extends Sorter{
	public BubbleSorter() {
		type = "Bubble";
	}
	
	@Override
	void sort(int[] array, SortingVisualizer display) {
		for (int i = 0; i < array.length - 1 ; i++) {
			for (int j = i+1; j < array.length; j++) {
				if(array[i]>array[j]) {
					int a = array[i];
					int b = array[j];
					array[i] = b;
					array[j] = a;
					display.updateDisplay();
				}
			}
			}
	}
	
}
