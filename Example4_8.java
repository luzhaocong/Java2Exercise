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
		System.out.println("Բ������:"+cir);
		System.out.println("Բ׶��bottom����:"+cirl.bottom);
		cirl.setheight(5);
		cirl.setbottom(cir);
		System.out.println("Բ������"+cir);
		System.out.println("Բ׶��bottom������"+cirl.bottom);
		System.out.println("Բ׶�����"+cirl.getvolume());
		System.out.println("�޸�Բ�İ뾶,bottom�İ뾶ͬ���仯");
		cir.setradius(20);
		System.out.println("bottom�İ뾶��"+cirl.getbottomradius());
		System.out.println("���´���Բ��bottom�����ý������仯");
		cir = new circle();
		System.out.println("Բ�����ã�"+cir);
		System.out.println("���ǲ�Ӱ��Բ׶��bottom����");
		System.out.println("Բ׶��bottom���ã�"+cirl.bottom);

	}

}
