package livecodingproblems;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueNames {
	//NA NASTEPNYCH ZAJECIACH: TDD+MOCKOWANIE
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Z", "A", "B", "A", "C", "D", "A", "B", "Z");

		Collection<String> uniqueNames = uniqueNames(names);
		System.out.println(uniqueNames);
	}

	private static Collection<String> uniqueNames(List<String> names) {
		if (names == null) {
			throw new IllegalArgumentException("Names can not be null");
		}
		return names.stream().collect(Collectors.toCollection(LinkedHashSet::new));
	}
}
