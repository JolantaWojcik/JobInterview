package sitoeratostenesa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SitoEratostenesa {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
        System.out.print("Maximum number? ");
        int max = console.nextInt();
        
		List<Integer> numbers = new ArrayList();
		for(int i=2; i<=max; i++){
			numbers.add(i);
		}
		System.out.println(numbers);

		List<Integer> result = sito(numbers);
		System.out.println(result);
		
	}
	
	public static List<Integer> sito(List<Integer> numbers) throws Exception{
		if(numbers == null){
			throw new Exception();
		}
		List<Integer> primes = new ArrayList<Integer>();
		while(!numbers.isEmpty()){
			int first = numbers.get(0);
			numbers.remove(0);
			primes.add(first);
			for(int i=0; i <numbers.size(); i++){
				if(numbers.get(i)%first==0){
					numbers.remove(i);
				}
			}
		}

		return primes;
	}

}
