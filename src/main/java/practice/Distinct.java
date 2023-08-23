package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Distinct {

	public static void main(String[] args) {

		List<Integer> numbersIntegers = Arrays.asList(10, 50, 20, 30, 40, 10);
		List<Object> distinct = numbersIntegers.stream().distinct().collect(Collectors.toList());
		System.out.println(distinct);

	}

}
