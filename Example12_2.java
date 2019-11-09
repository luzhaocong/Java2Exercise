class ElephantTarget implements Runnable {
	public void run() {
		for (int i = 1; i <= 20; i++) {
			System.out.print("´óÏó" + i + " ");
		}
	}
}

class CarTarget implements Runnable {
	public void run() {
		for (int i = 0; i <= 20; i++) {
			System.out.print("½Î³µ" + i + " ");
		}
	}
}

public class Example12_2 {
	public static void main(String[] args) {
		Thread speak_elephant;
		Thread speak_car;
		ElephantTarget elephant = new ElephantTarget();
		CarTarget car = new CarTarget();
		speak_elephant = new Thread(elephant);
		speak_car = new Thread(car);
		speak_elephant.start();
		speak_car.start();
	}

}
