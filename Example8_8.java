import java.util.Scanner;

class encrypt_and_decrypt {
	String encry(String source_string, String password) {
		char[] p = password.toCharArray();
		int n = p.length;
		char[] c = source_string.toCharArray();
		int m = c.length;
		for (int k = 0; k < m; k++) {
			c[k] += p[k % n];
		}
		return new String(c);
	}

	String decry(String source_string, String password) {
		char[] p = password.toCharArray();
		int n = p.length;
		char[] c = source_string.toCharArray();
		int m = c.length;
		for (int k = 0; k < m; k++)
			c[k] -= p[k % n];
		return new String(c);
	}
}

public class Example8_8 {

	public static void main(String[] args) {
		String source = "����ʮ�����";
		encrypt_and_decrypt person = new encrypt_and_decrypt();
		Scanner sc = new Scanner(System.in);
		System.out.println("����������ܣ�" + source);
		String password = sc.nextLine();
		String secret = person.encry(source, password);
		System.out.println("����Ϊ��" + secret);
		System.out.println("����������룺");
		password = sc.nextLine();
		String source_1 = person.decry(secret, password);
		System.out.println("����Ϊ��" + source_1);

	}

}
