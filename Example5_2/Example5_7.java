package Example5_2;

class sum{
	int n;
	float f() {
		float sum = 0;
		for(int i=1;i<=n;i++) 
			sum+=i;
		return sum;
	}
}

class average extends sum{
	int n;
	float f() {
		float c;
		super.n=n;
		c=super.f();
		return c/n;
	}
	float g() {
		float c;
		c=super.f();
		return c/2;
	}
}
public class Example5_7 {

	public static void main(String[] args) {
		average aver = new average();
		aver.n=100;
		float result_one = aver.f();
		float result_two = aver.g();
		System.out.println("resultone="+result_one);
		System.out.println("resulttwo="+result_two);

	}

}
