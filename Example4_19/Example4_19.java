package Example4_19;
class student{
	private int age;
	public void set_age(int age){
		if(age<=28&&age>=7){
			this.age=age;
		}
	}
	public int get_age(){
		return age;
	}
}
public class Example4_19 {
	public static void main(String[] args) {
		student zhang,geng;
		zhang = new student();
		geng =new student();
		zhang.set_age(23);
		geng.set_age(25);
		System.out.println("zhang的年龄："+zhang.get_age()+'\n'+"geng的年龄："+geng.get_age());
	}

}
