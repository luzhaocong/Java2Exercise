package �������ģ����;

interface Animal {
	void cry();

	String getAnimalName();
}

class Dog implements Animal {
	public void cry() {
		System.out.println("����������");
	}

	public String getAnimalName() {
		return "��";
	}
}

class Cat implements Animal {
	public void cry() {
		System.out.println("����������");
	}

	public String getAnimalName() {
		return "è";
	}
}

class Simulator {
	void playSound(Animal animal) {
		String a = animal.getAnimalName();
		System.out.print(a + ":");
		animal.cry();
	}
}

public class Application {

	public static void main(String[] args) {
		Simulator si = new Simulator();
		Dog dog = new Dog();
		Cat cat = new Cat();
		si.playSound(dog);
		si.playSound(cat);
	}

}
