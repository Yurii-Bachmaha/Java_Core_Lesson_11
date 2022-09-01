package task01;

import java.util.Arrays;
import java.util.Collections;

public class Application {

	public static void main(String[] args) {

		Integer[] array = { 1, 3, 426, 634, 23, 12, 45, 65, 15, 49, 76, 20, 6789, 4, 56678 };

		System.out.println("Sort in ascending order: ");
		Arrays.sort(array);
		System.out.println(Arrays.toString(array) + "\n");

		System.out.println("Sort in descending order: ");
		Arrays.sort(array, Collections.reverseOrder());
		;
		System.out.println(Arrays.toString(array));
	}
}