package mergsort;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] list = {1,5,7,2,9,3,11};
		MergeSort ms = new MergeSort();
		int[] result = ms.mergeSort(list);
		System.out.println(Arrays.toString(result));
	}
	
	public int[] mergeSort(int[] list){
//		if(list.length<=1){
//			throw new IllegalArgumentException("List to short!");
//		}
		int middleValue = list.length/2;
		int[] right = mergeSort(Arrays.copyOfRange(list, 0, middleValue));
		int[] left = mergeSort(Arrays.copyOfRange(list, middleValue, list.length));
		//int[] rightList= mergeSort(list, middleValue, list.length);
		return merge(right, left);
	}
	
	public int[] merge(int[] leftList, int[] rightList){
		int[] result = new int[leftList.length+rightList.length];
		int resultIndex = 0;
		int firstArrayIndex=0;
		int secondArrayIndex =0;
		while(firstArrayIndex<leftList.length || secondArrayIndex<rightList.length){
			if(firstArrayIndex<leftList.length && leftList[firstArrayIndex]<rightList[secondArrayIndex]
					|| secondArrayIndex==rightList.length){
				result[resultIndex]=leftList[firstArrayIndex];
				secondArrayIndex++;
			}else{
				result[resultIndex]=rightList[secondArrayIndex];
				secondArrayIndex++;
			}
			resultIndex++;
		}
		return result;
	}
}
