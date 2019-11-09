package Example6_1;

interface computable {
	int MAX = 46;

	int f(int x);
}

class china implements computable {
	int number;

	public int f(int x) {
		int sum = 0;
		for (int i = 1; i <= x; i++)
			sum += i;
		return sum;
	}
}

class japan implements computable {
	int number;

	public int f(int x) {
		return MAX + x;
	}
}

public class Example6_1 {
	public static void main(String args[]) {
		china zhang;
		japan henlu;
		zhang = new china();
		henlu = new japan();
		zhang.number = 32 + computable.MAX;
		henlu.number = 14 + computable.MAX;
		System.out.println("zhang的学号" + zhang.number + ",zhang的求和结果" + zhang.f(100));
		System.out.println("henlu的学号" + henlu.number + ",henlu的求和结果" + henlu.f(100));

	}
}
