package livecodingproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayConverter {
	public static void main(String[] args) {
		String[] numbers = {"1","2","3","4","ala ma kota","5"};
		
		Integer[] array = convert(numbers);
		System.out.println(Arrays.toString(array));
	}

	private static Integer[] convert(String[] numbers) {
		List<Integer> listOfNumbers = new ArrayList<>();
		Integer[] array = new Integer[numbers.length-1];
		if(numbers==null){
			throw new IllegalArgumentException("Pusta tablica");
		}
		for(String number : numbers){
			if(number.matches("[0-9]+")){
				int n = Integer.valueOf(number);
				listOfNumbers.add(n);
			}
		}
		return listOfNumbers.toArray(array);
	}
}
