package livecodingproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ArrayConverter {
	public static void main(String[] args) {
		String[] numbers = {"-1","2","3","4","ala ma kota","5"};
		
		Integer[] array = convert(numbers);
		System.out.println(Arrays.toString(array));
		String[] strings;
	}

	private static Integer[] convert(String[] numbers) {
		if(numbers==null){
			throw new IllegalArgumentException("Pusta tablica");
		}
		List<Integer> listOfNumbers = new ArrayList<>();
		Integer[] array = new Integer[numbers.length-1];
		for(String number : numbers){
			if(number.matches("-?[0-9]+")){
				int n = Integer.valueOf(number);
				listOfNumbers.add(n);
			}
		}
		return listOfNumbers.toArray(array);
	}public Map<String, String> pairs(String[] strings) {
		  if(strings.length==0){
			    
		  }
		   Map<String, String> map = new HashMap<String, String>();
				  // for(int i=0; i<strings.length; i++){
				  //   if(strings[i].length()==1){
				  //       map.put(strings[i], strings[i]);
				  //   }
				  //   map.put(strings[i].substring(0, 1), strings[i]
				  //   .substring(strings.length-1));
				  // }
				  for(String str : strings){
				    String str2 = String.valueOf(str.charAt(0)); 
				    
				  }
		  return map;
		}
	public Map<String, Integer> wordCount(String[] strings) {
		 Map<String, Integer> map = new HashMap<String, Integer>();
		 int count=0;
				  for(int i=0; i<strings.length-1; i++){
				    if(map.get(strings[i])!=null){
				      map.put(strings[i], count++);
				    }
				  }
				  return map;
			}


}
