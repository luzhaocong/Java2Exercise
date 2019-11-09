class rect {
	double width,height;
	double getarea(){
		double area = width*height;
		return area;
	}
	
}

class lader{
	double above,bottom,height;
	double getarea(){
		return(above+bottom)*height/2;
	}
	
}
public class Example4_5 {
	public static void main(String[] args) {
		rect ra=new rect();
		ra.width = 109.87;
		ra.height = 25.18;
		System.out.println("矩形的面积："+ra.getarea());
		lader la = new lader();
		la.above = 10.798;
		la.bottom = 156.65;
		la.height = 18.12;
		System.out.println("梯形的面积："+la.getarea());
	}

}
