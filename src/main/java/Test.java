import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
	public static void main(String[] args) {
		int arr[] = { 4, 1, 9, 7, -1, 5, 8, -2, 1 };
		int count = 0;
		for (int i = 0, j = 1; i < arr.length - 1; j++) {
			if (j == arr.length - 1) {
				j = ++i;
			}
			int sum = arr[i] + arr[j];
			if (sum == 6) {
				count++;
			}
		}
		System.out.println(count);

	}}


