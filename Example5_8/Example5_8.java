package Example5_8;

class student {
	int number;
	String name;
	student(){
	}
	student(int number,String name){
		this.number=number;
		this.name = name;
		System.out.println("我的名字是："+name+"学号是："+number);
	}
}

class universtudent extends student{
	boolean married;
	universtudent (int number,String name,boolean b){
		super(number,name);
		married = b;
		System.out.println("婚否="+married);
	}
}
public class Example5_8 {

	public static void main(String[] args) {
		universtudent zhang = new universtudent(9901,"和晓玲",false);
	}

}
