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
		System.out.println("公共汽车使用窟式刹车技术");
	}

	public void charge() {
		System.out.println("公共汽车：一元/张，不记公里数");
	}
}

class taxi extends motorvehicles implements moneyfare, controltemperature {
	void brake() {
		System.out.println("出租车使用盘式刹车技术");
	}

	public void charge() {
		System.out.println("出租车：2元/公里，起价3公里");
	}

	public void control_air_temperature() {
		System.out.println("出租车安装了Hair空调");
	}
}

class cinema implements moneyfare, controltemperature {
	public void charge() {
		System.out.println("电影院：门票，十元/张");
	}

	public void control_air_temperature() {
		System.out.println("电影院安装了中央空调");
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
