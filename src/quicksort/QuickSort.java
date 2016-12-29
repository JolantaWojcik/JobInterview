package quicksort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,5,7,2,6));
		Integer pivot = list.get(list.size()/2);
		System.out.println(pivot);
		System.out.println(quickSort(list));
	}

	public static List<Integer> quickSort(List<Integer> list) {
		if(list.size()<=1)return list;
		
		List<Integer> result = new ArrayList<>();
		List<Integer> smaller = new ArrayList<>();
		List<Integer> bigger = new ArrayList<>();
		Integer pivot = list.get(list.size()/2);
		list.remove(pivot);
		for(Integer number : list){
			if(number<pivot){
				smaller.add(number);
			}else{
				bigger.add(number);
			}
		}
		smaller = quickSort(smaller);
		bigger = quickSort(bigger);
		result.addAll(smaller);
		result.add(pivot);
		result.addAll(bigger);
		return result;
	}
}
