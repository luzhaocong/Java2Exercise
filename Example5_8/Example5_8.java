package Example5_8;

class student {
	int number;
	String name;
	student(){
	}
	student(int number,String name){
		this.number=number;
		this.name = name;
		System.out.println("�ҵ������ǣ�"+name+"ѧ���ǣ�"+number);
	}
}

class universtudent extends student{
	boolean married;
	universtudent (int number,String name,boolean b){
		super(number,name);
		married = b;
		System.out.println("���="+married);
	}
}
public class Example5_8 {

	public static void main(String[] args) {
		universtudent zhang = new universtudent(9901,"������",false);
	}

}
