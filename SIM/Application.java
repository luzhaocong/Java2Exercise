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
		System.out.println("ʹ�õĿ��ǣ�"+card.give_corpname()+"�ṩ��");
		System.out.println("�ֻ������ǣ�"+card.give_number());
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
		return "�й��ƶ�";
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
		return "�й���ͨ";
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
