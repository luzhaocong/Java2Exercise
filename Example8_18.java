import java.util.*;

class GetRandomNumber {
	public static int[] get_random_number(int max, int amount) {
		int[] random_number = new int[amount];
		int index = 0;
		random_number[0] = -1;
		Random rd = new Random();
		while (index < amount) {
			int number = rd.nextInt(max) + 1;
			boolean is_in_arrays = false;
			for (int m : random_number) {
				if (m == number)
					is_in_arrays = true;
			}
			if (is_in_arrays == false) {
				random_number[index] = number;
				index++;
			}
		}
		return random_number;
	}
}

public class Example8_18 {

	public static void main(String[] args) {
		int[] a = GetRandomNumber.get_random_number(100, 6);
		System.out.println(java.util.Arrays.toString(a));

	}
}
