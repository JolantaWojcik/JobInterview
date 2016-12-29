package livecodingproblems;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//mergesort, quicksort, palindrome, anagram, wlasna lista (wraz z iteratorem), fibonacci, i inne algorymy liczbowe, 
//NWW, NWD itp 
public class LiveCodingProblems {
	public static void main(String[] args) {
		
		List<Integer> elements = Collections.unmodifiableList(Arrays.asList(1, 2, 3, 4, 5));
		System.out.println(topN(3, elements));
		String test = "kot";
		System.out.println(reverseString(test));
		for (int i = 1; i <= 30; i++) {
			System.out.println("fib(" + i + ")=" + fibRecursion(i));
		}
		System.out.println(fibIter(3000));
		System.out.println(fibRecursion(40000));
	}

	public static List<Integer> topN(int n, List<Integer> elements) {
		// walidacje argumentow na wejsciu
		validateTopNArguments(n, elements);

		// logike pobierajaca n elemntow***
		return elements.stream().sorted(Collections.reverseOrder()).limit(n).collect(Collectors.toList());
	}

	private static void validateTopNArguments(int n, List<Integer> elements) {
		if (elements == null) {
			throw new IllegalArgumentException("List of elements cannot be null!");
		}
		if (n < 1) {
			throw new IllegalArgumentException("N should be positive number, greater then 1");
		}
		if (elements.size() < n) {
			throw new IllegalArgumentException("There is not enough elements to complete the task!");
		}
	}

	public static String reverseString(String str) {
		// sprawdenie czy str jest nullem

		// wydajnosc!!! - uzycie konkatenacji jest kosztowne czasowo!
		// for (int i = str.length() - 1; i >= 0; i--) {
		// sb.append(str.charAt(i));
		// }
		return new StringBuilder(str).reverse().toString();
	}

	// iteracyjny
	// rekurencyjny
	// znajdz n-ty wyraz ciagu fibonacciego
	// 1,1,2,3,5,8,13,21,34...
	// fib(4) = 3
	// fib(7) = 13
	public static BigInteger fibIter(int n) {
		if (n < 1) {
			throw new IllegalArgumentException("N should be greater then 0!");
		}
		if (n == 1 || n == 2) {
			return BigInteger.ONE;
		}
		// n = 10, to on stworzy 10 elementowa tablice
		// n = 1000 to on stworzy 1000 elementowa tablice
		// n = 1000000 to on stworzy 10000...
		// MARNOWANIE PAMIECI

		// ZAWSZE 3 zmienne
		BigInteger actual = BigInteger.ONE;
		BigInteger prev = BigInteger.ONE;
		BigInteger lastPrev = BigInteger.ONE;
		for (int i = 2; i < n; i++) {
			actual = prev.add(lastPrev);
			lastPrev = prev;
			prev = actual;
		}
		return actual;
	}

	public static BigInteger fibRecursion(int n) {
		if (n < 1) {
			throw new IllegalArgumentException("N should be greater then 0!");
		}
		if (n == 1 || n == 2) {
			return BigInteger.ONE;
		}
		return fibRecursion(n - 1).add(fibRecursion(n - 2));
	}

	// ala, laa, aal
	// aal, aal
	// laaaa
	// las.contains(a)? tak
	// las.contains(l)? tak
	// las.contains(a)? tak
	// czy anagram? nie
	public static boolean isAnagram(String s1, String s2) {
		// ==========================walidacja argumentow s1 i s2 nie moga byc
		// nullami!=================================
		return sortChars(s1).equals(sortChars(s2));
	}

	// ala z nad morza
	// aaaam...
	private static String sortChars(String str) {
		// 5=6
		char[] chars = str.toCharArray();
		Arrays.sort(chars);
		return new String(chars);
	}

	public static boolean isPalindrome(String str) {
		if (str == null) {
			return false;
		}
		//kajak
		//k   k
		// a a
		//  j
		// a a
		//k   k
		char[] chars = str.toCharArray();
		for (int i = 0; i < str.length() / 2; i++) {
			if (chars[i] != chars[str.length() - 1 - i]) {
				return false;
			}
		}
		return true;
	}
}
