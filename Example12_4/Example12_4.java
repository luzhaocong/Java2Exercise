package Example12_4;

class House implements Runnable {
	int water_amount;
	Thread dog, cat;

	House() {
		dog = new Thread(this);
		cat = new Thread(this);
	}

	public void setWater(int w) {
		water_amount = w;
	}

	public void run() {
		while (true) {
			Thread t = Thread.currentThread();
			if (t == dog) {
				System.out.println("家狗喝水");
				water_amount -= 2;
			} else if (t == cat) {
				System.out.println("家猫喝水");
				water_amount -= 1;
			}
			System.out.println(" 剩 " + water_amount);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
			if (water_amount <= 0)
				return;
		}
	}
}

public class Example12_4 {
	public static void main(String[] args) {
		House house = new House();
		house.setWater(10);
		house.dog.start();
		house.cat.start();
	}

}
