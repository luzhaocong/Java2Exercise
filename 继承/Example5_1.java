package �̳�;
class people{
	int age,leg=2,hand=2;
	protected void show_people_mess(){
		System.out.printf("%d�꣬%dֻ�ţ�%dֻ��\t",age,leg,hand);
	}
}

class student extends people{
	int number;
	void tell_number(){
		System.out.printf("ѧ�ţ�%d\t",number);
	}
	int add(int x,int y){
		return x+y;
	}
	
}
class universtudent extends student{
	int multi(int x,int y){
		return x*y;
	}
}

public class Example5_1 {
	public static void main(String[] args) {
		student zhang = new student();
		zhang.age = 17;
		zhang.number = 100101;
		zhang.show_people_mess();
		zhang.tell_number();
		int x=9,y=29;
		System.out.printf("�����ӷ�");
		System.out.println("x+y="+zhang.add(x,y));
		universtudent geng = new universtudent();
		geng.age = 21;
		geng.number = 6609;
		geng.show_people_mess();
		geng.tell_number();
		System.out.printf("�����ӷ���%d\t",geng.add(x,y));
		System.out.println("�����˷���"+geng.multi(x,y));
	}

}
