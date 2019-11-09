import java.util.Random;

abstract class RedEnvelope {
	public double remain_money;
	public int remain_people;
	public double money;

	public abstract double give_money();
}

class RandomRedEnvelope extends RedEnvelope {
	double min_money;
	int interger_remain_money;
	int random_money;
	Random random;

	RandomRedEnvelope(double remain_money, int remain_people) {
		random = new Random();
		min_money = 0.01;
		this.remain_money = remain_money;
		this.remain_people = remain_people;
		interger_remain_money = (int) (remain_money * 100);
		if (interger_remain_money < remain_people * (int) (min_money * 100)) {
			interger_remain_money = remain_people * (int) (min_money * 100);
			this.remain_money = (double) interger_remain_money;
		}
	}

	public double give_money() {
		if (remain_people <= 0)
			return 0;
		if (remain_people == 1) {
			money = remain_money;
			remain_people--;
			return money;
		}
		random_money = random.nextInt(interger_remain_money);
		if (random_money < (int) (min_money * 100)) {
			random_money = (int) (min_money * 100);
		}
		int left_other_people_money = interger_remain_money - random_money;
		int other_people_need_money = (remain_people - 1) * (int) (min_money * 100);
		if (left_other_people_money < other_people_need_money)
			random_money -= (other_people_need_money - left_other_people_money);
		interger_remain_money = interger_remain_money - random_money;
		remain_money = (double) (interger_remain_money / 100.0);
		remain_people--;
		money = (double) (random_money / 100.0);
		return money;
	}
}

public class Example8_23 {

	public static void main(String[] args) {
		RedEnvelope red = new RandomRedEnvelope(5.20, 6);
		System.out.printf("以下用循环输出%d个人抢%.2f元的随机红包:\n", red.remain_people, red.remain_money);
		showProcess(red);
	}

	static void showProcess(RedEnvelope red) {
		double sum = 0;
		while (red.remain_people > 0) {
			double money = red.give_money();
			System.out.printf("%.2f\t", money);
			sum += money;
		}
		String s = String.format("%.2f\t", sum);
		sum = Double.parseDouble(s);
		System.out.printf("\n%.2f元的红包被抢完", sum);
	}
}
