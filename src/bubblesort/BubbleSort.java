package bubblesort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int [] toSort = {1,9,7,5,2};
		if(toSort.length<2){
			throw new IllegalArgumentException("List to short!");
		}
		for(int i=0; i<toSort.length; i++){
			for(int j=1; j<toSort.length; j++){
				if(toSort[j-1]>toSort[j]){
					int bigger = toSort[j-1];
					toSort[j-1] = toSort[j];
					toSort[j] = bigger;
				}
			}
		}
		System.out.println(Arrays.toString(toSort));
	}

}
