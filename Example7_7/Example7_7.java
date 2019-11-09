package Example7_7;

class danger_exception extends Exception {
	final String message = "超重";

	public String warn_mess() {
		return message;
	}
}

class cargo_boat {
	int real_content, max_content;

	public void set_max_content(int c) {
		max_content = c;
	}

	public void loading(int m) throws danger_exception {
		real_content += m;
		if (real_content > max_content) {
			real_content -= m;
			throw new danger_exception();
		}
		System.out.println("目前装载了" + real_content + "吨货物");
	}
}

public class Example7_7 {

	public static void main(String[] args) {
		cargo_boat ship = new cargo_boat();
		ship.set_max_content(1000);
		int m = 600;
		try {
			ship.loading(m);
			m = 400;
			ship.loading(m);
			m = 367;
			ship.loading(m);
			m = 555;
			ship.loading(m);
		} catch (danger_exception e) {
			System.out.println(e.warn_mess());
			System.out.println("无法再装载重量是" + m + "吨的集装箱");
		} finally {
			System.out.println("货物将正点启航");
		}
	}

}
