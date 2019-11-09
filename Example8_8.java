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
		String source = "今晚十点进攻";
		encrypt_and_decrypt person = new encrypt_and_decrypt();
		Scanner sc = new Scanner(System.in);
		System.out.println("输入密码加密：" + source);
		String password = sc.nextLine();
		String secret = person.encry(source, password);
		System.out.println("密文为：" + secret);
		System.out.println("输入解秘密码：");
		password = sc.nextLine();
		String source_1 = person.decry(secret, password);
		System.out.println("明文为：" + source_1);

	}

}
