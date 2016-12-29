package mergsort;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] list = {1,5,7,2,3,4};
		int[] result = mergeSort(list, 0, list.length);
		System.out.println(Arrays.toString(result));
	}
	
	public static int[] mergeSort(int[] list, int start, int end){
		if(start==end){
			throw new IllegalArgumentException("List to short!");
		}
		int middleValue = (start+end)/2;
		int[] leftList = mergeSort(list,0,middleValue);
		int[] rightList= mergeSort(list, middleValue, list.length);
		return merge(leftList, rightList);
	}
	
	public static int[] merge(int[] leftList, int[] rightList){
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
