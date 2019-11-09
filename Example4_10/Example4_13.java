package Example4_10;


class circle{
	double radius,area;
	void set_radius(double r){
		radius = r;	
	}
	double get_area(){
		area = 3.14*radius*radius;
		return area;
	}
}

class tixing{
	double above,bottom,height;
	tixing(double a,double b,double c){
		above=a;
		bottom=b;
		height=c;
	}
	double get_area(){
		return (above+bottom)*height/2;
	}
}

class student{
	double computer_area(circle c){
		double area=c.get_area();
		return area;
	}
	double computer_area(tixing t){
		double area = t.get_area();
		return area;
	}
}

public class Example4_13 {
	public static void main(String[] args) {
		circle cir = new circle();
		cir.set_radius(196.87);
		tixing tx = new tixing(3,21,9);
		student stu = new student();
		System.out.println("zhang计算圆的面积：");
		System.out.println(stu.computer_area(cir));
		System.out.println("zhang计算梯形的面积：");
		System.out.println(stu.computer_area(tx));
	}

}
