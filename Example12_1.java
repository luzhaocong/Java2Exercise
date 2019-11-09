class SpeakElephant extends Thread {
	public void run() {
		for (int i = 1; i <= 20; i++) {
			System.out.print("大象" + i + " ");
		}
	}
}

class SpeakCar extends Thread {
	public void run() {
		for (int i = 0; i <= 20; i++) {
			System.out.print("轿车" + i + " ");
		}
	}
}

public class Example12_1 {
	public static void main(String[] args) {
		SpeakElephant speak_elephant = new SpeakElephant();
		SpeakCar speak_car = new SpeakCar();
		speak_elephant.start();
		speak_car.start();
		for (int i = 0; i <= 15; i++) {
			System.out.print("主人" + i + " ");
		}
	}

}
