package ������;

class vehicle {
	double speed;
	int power;

	void speed_up(int s) {
		speed += s;
	}

	void speed_down(int s) {
		speed -= s;
	}

	void set_power(int p) {
		power = p;
	}

	int get_power() {
		return power;
	}

	double get_speed() {
		return speed;
	}
}

public class User {

	public static void main(String[] args) {
		vehicle car1, car2;
		car1 = new vehicle();
		car2 = new vehicle();
		car1.set_power(128);
		car2.set_power(76);
		System.out.println("car1�Ĺ����ǣ�" + car1.get_power());
		System.out.println("car2�Ĺ����ǣ�" + car2.get_power());
		car1.speed_up(80);
		car2.speed_up(100);
		System.out.println("car1��Ŀǰ�ٶȣ�" + car1.get_speed());
		System.out.println("car2��Ŀǰ�ٶȣ�" + car2.get_speed());
		car1.speed_down(10);
		car2.speed_down(20);
		System.out.println("car1��Ŀǰ�ٶȣ�" + car1.get_speed());
		System.out.println("car2��Ŀǰ�ٶȣ�" + car2.get_speed());
	}

}
