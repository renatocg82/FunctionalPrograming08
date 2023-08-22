package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App06 {

	public static void main(String[] args) {

		List<Integer> intList = Arrays.asList(3, 4, 5, 10, 7);

		Stream<Integer> str1 = intList.stream().map(x -> x*10);
		System.out.println(Arrays.toString(str1.toArray()));
		
		int sum;
		sum = intList.stream().reduce(0, (x, y) -> (x + y));
		System.out.println("Sum = " + sum);
		
		int mult;
		mult = intList.stream().reduce(1, (x, y) -> (x * y));
		System.out.println("Mult = " + mult);
		
		List<Integer> intList2 = intList.stream()
				.filter(x -> x % 2 == 0)
				.map(x -> x * 10)
				.collect(Collectors.toList());
		
		System.out.println(Arrays.toString(intList2.toArray()));
		
		
	}

}
