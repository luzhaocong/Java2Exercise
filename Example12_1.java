class SpeakElephant extends Thread {
	public void run() {
		for (int i = 1; i <= 20; i++) {
			System.out.print("����" + i + " ");
		}
	}
}

class SpeakCar extends Thread {
	public void run() {
		for (int i = 0; i <= 20; i++) {
			System.out.print("�γ�" + i + " ");
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
			System.out.print("����" + i + " ");
		}
	}

}
