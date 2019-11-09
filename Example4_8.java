class circle{
	double radius,area;
	void setradius(double r){
		radius=r;
	}
	double getradius(){
		return radius;
	}
	double getarea(){
		area=3.14*radius*radius;
		return area;
	}
}

class circular{
	circle bottom;
	double height;
	void setbottom(circle c){
		bottom=c;
	}
	void setheight(double h){
		height = h;
	}
	double getvolume(){
		if(bottom==null)
			return -1;
		else
			return bottom.getarea()*height/3;
		
	}
	double getbottomradius() {
		return bottom.getarea();
	}
	public void setbottomradius(double r){
		bottom.setradius(r);
	}
}

public class Example4_8 {
	public static void main(String[] args) {
		circle cir =new circle();
		cir.setradius(10);
		circular cirl = new circular();
		System.out.println("圆的引用:"+cir);
		System.out.println("圆锥的bottom引用:"+cirl.bottom);
		cirl.setheight(5);
		cirl.setbottom(cir);
		System.out.println("圆的引用"+cir);
		System.out.println("圆锥的bottom的引用"+cirl.bottom);
		System.out.println("圆锥的体积"+cirl.getvolume());
		System.out.println("修改圆的半径,bottom的半径同样变化");
		cir.setradius(20);
		System.out.println("bottom的半径："+cirl.getbottomradius());
		System.out.println("重新创建圆，bottom的引用将发生变化");
		cir = new circle();
		System.out.println("圆的引用："+cir);
		System.out.println("但是不影响圆锥的bottom引用");
		System.out.println("圆锥的bottom引用："+cirl.bottom);

	}

}
