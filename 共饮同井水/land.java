package ����ͬ��ˮ;

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
			System.out.println(name + "����" + n + "��ˮ");
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
		System.out.println("ˮ������" + left_water + "��ˮ");
		village zhaozhuang, majiahezhi;
		zhaozhuang = new village("��ׯ");
		majiahezhi = new village("��Һ���");
		zhaozhuang.set_people_number(80);
		majiahezhi.set_people_number(120);
		zhaozhuang.drink_water(50);
		left_water = majiahezhi.look_water_amount();// village.look_water_amount();��̬�Ŀ���ֱ��ͨ����������
		System.out.println("��Һ��ӷ���ˮ������" + left_water + "��ˮ");
		majiahezhi.drink_water(100);
		left_water = zhaozhuang.look_water_amount();
		String name = zhaozhuang.name;
		System.out.println(zhaozhuang.name + "����ˮ������" + left_water + "��ˮ");
		int people_number = zhaozhuang.get_people_number();
		System.out.println("��ׯ���˿ڣ�" + people_number);
		people_number = majiahezhi.get_people_number();
		System.out.println("��Һ��ӵ��˿ڣ�" + people_number);

	}

}
