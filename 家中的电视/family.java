package 家中的电视;

public class family {
	tv hometv;
	void buy_tv(tv t) {
		hometv=t;
	}
	void remote_control(int m) {
		hometv.set_channel(m);
	}
	void see_tv() {
		hometv.show_program();
	}
}
