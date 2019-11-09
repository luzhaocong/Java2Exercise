class House implements Runnable {
	int waterAmount;

	public void setWater(int w) {
		waterAmount = w;
	}

	public void run() {
		while (true) {
			String name = Thread.currentThread().getName();
			if (name.equals("¹·")) {
				System.out.println(name + "ºÈË®");
				waterAmount = waterAmount - 2;
			} else if (name.equals("Ã¨")) {
				System.out.println(name + "ºÈË®");
				waterAmount = waterAmount - 1;
			}
			System.out.println(" Ê£ " + waterAmount);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
			if (waterAmount <= 0)
				return;
		}
	}
}

public class Example12_3 {

	public static void main(String[] args) {
		House house = new House();
		house.setWater(10);
		Thread dog, cat;
		dog = new Thread(house);
		cat = new Thread(house);
		dog.setName("¹·");
		cat.setName("Ã¨");
		dog.start();
		cat.start();
	}

}
