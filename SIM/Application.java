package SIM;
abstract class sim{
	public abstract void set_number(String n);
	public abstract String give_number();
	public abstract String give_corpname();
}

class mobile_telephone{
	sim card;
	public void use_sim(sim card) {
		this.card = card;
	}
	public void show_mess() {
		System.out.println("使用的卡是："+card.give_corpname()+"提供的");
		System.out.println("手机号码是："+card.give_number());
	}
}

class sim_of_chinamobile extends sim{
	String number;
	public void set_number(String n) {
		number = n;
	}
	public String give_number() {
		return number;
	}
	public String give_corpname() {
		return "中国移动";
	}
}

class sim_of_chinaunicom extends sim{
	String number;
	public void set_number(String n) {
		number = n;
	}
	public String give_number() {
		return number;
	}
	public String give_corpname() {
		return "中国联通";
	}
}
public class Application {
	public static void main(String[] args) {
		mobile_telephone tele = new mobile_telephone();
		sim s = new sim_of_chinamobile();
		s.set_number("12345678901");
		tele.use_sim(s);
		tele.show_mess();
		s = new sim_of_chinaunicom();
		s.set_number("98765432109");
		tele.use_sim(s);
		tele.show_mess();
	}

}
