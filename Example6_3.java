abstract class motorvehicles {
	abstract void brake();
}

interface moneyfare {
	void charge();
}

interface controltemperature {
	void control_air_temperature();
}

class bus extends motorvehicles implements moneyfare {
	void brake() {
		System.out.println("��������ʹ�ÿ�ʽɲ������");
	}

	public void charge() {
		System.out.println("����������һԪ/�ţ����ǹ�����");
	}
}

class taxi extends motorvehicles implements moneyfare, controltemperature {
	void brake() {
		System.out.println("���⳵ʹ����ʽɲ������");
	}

	public void charge() {
		System.out.println("���⳵��2Ԫ/������3����");
	}

	public void control_air_temperature() {
		System.out.println("���⳵��װ��Hair�յ�");
	}
}

class cinema implements moneyfare, controltemperature {
	public void charge() {
		System.out.println("��ӰԺ����Ʊ��ʮԪ/��");
	}

	public void control_air_temperature() {
		System.out.println("��ӰԺ��װ������յ�");
	}
}

public class Example6_3 {

	public static void main(String[] args) {
		bus bus101 = new bus();
		taxi bule_taxi = new taxi();
		cinema red_star_cinema = new cinema();
		moneyfare fare;
		controltemperature temperature;
		fare = bus101;
		bus101.brake();
		fare.charge();
		fare = bule_taxi;
		temperature = bule_taxi;
		bule_taxi.brake();
		fare.charge();
		temperature.control_air_temperature();
		fare = red_star_cinema;
		fare.charge();
		temperature.control_air_temperature();

	}

}
