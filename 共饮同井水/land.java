package 共饮同井水;

class village {
	static int water_amount;
	int people_number;
	String name;

	village(String s) {
		name = s;

	}

	static void set_water_amount(int m) {
		if (m > 0)
			water_amount = m;
	}

	void drink_water(int n) {
		if (water_amount - n >= 0) {
			water_amount -= n;
			System.out.println(name + "喝了" + n + "升水");
		} else
			water_amount = 0;
	}

	static int look_water_amount() {
		return water_amount;
	}

	void set_people_number(int n) {
		people_number = n;
	}

	int get_people_number() {
		return people_number;
	}
}

public class land {

	public static void main(String[] args) {
		village.set_water_amount(200);
		int left_water = village.water_amount;
		System.out.println("水井中有" + left_water + "升水");
		village zhaozhuang, majiahezhi;
		zhaozhuang = new village("赵庄");
		majiahezhi = new village("马家河子");
		zhaozhuang.set_people_number(80);
		majiahezhi.set_people_number(120);
		zhaozhuang.drink_water(50);
		left_water = majiahezhi.look_water_amount();// village.look_water_amount();静态的可以直接通过类名访问
		System.out.println("马家河子发现水井中有" + left_water + "升水");
		majiahezhi.drink_water(100);
		left_water = zhaozhuang.look_water_amount();
		String name = zhaozhuang.name;
		System.out.println(zhaozhuang.name + "发现水井中有" + left_water + "升水");
		int people_number = zhaozhuang.get_people_number();
		System.out.println("赵庄的人口：" + people_number);
		people_number = majiahezhi.get_people_number();
		System.out.println("马家河子的人口：" + people_number);

	}

}
