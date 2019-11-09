package Example4_10;

class lader{
	double top,height;
	static double bottom;
	void set_top(double a){
		top = a;
	}
	void set_bottom(double b){
		bottom = b;
	}
	double get_top(){
		return top;
	}
	double get_bottom(){
		return bottom;
	}
}

public class Example4_10 {
	public static void main(String[] args) {
		lader.bottom = 100;
		lader lad1 = new lader();
		lader lad2 = new lader();
		lad1.set_top(28);
		lad2.set_top(66);
		System.out.println("第一个梯形的上底："+lad1.get_top());
		System.out.println("第一个梯形的下底："+lad1.get_bottom());
		System.out.println("第二个梯形的上底："+lad2.get_top());
		System.out.println("第二个梯形的下底："+lad2.get_bottom());
	}

}
