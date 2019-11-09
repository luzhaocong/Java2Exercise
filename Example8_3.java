import java.util.*;

class sortstring {
	public static void sort(String a[]) {
		int count = 0;
		for (int i = 0; i < a.length; i++)
			for (int j = i + 1; j < a.length; j++) {
				if (a[j].compareTo(a[i]) < 0) {
					String temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
	}
}

public class Example8_3 {
	public static void main(String[] args) {
		String[] a = { "melon", "apple", "pear", "banana" };
		String[] b = { "西瓜", "苹果", "梨", "香蕉" };
		System.out.println("使用sortstring类的方法按字典序排列数组a：");
		sortstring.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.printf(" " + a[i]);
		}
		System.out.println("");
		System.out.println("使用类库中的Arrays类，按字典序排列数组b:");
		Arrays.sort(b);
		for (int i = 0; i < b.length; i++) {
			System.out.print(" " + b[i]);
		}
	}

	Scanner sc = new Scanner(System.in);

}
