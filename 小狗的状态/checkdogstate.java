package С����״̬;

interface dogstate{
	public void show_state();
}

class softlystate implements dogstate{
	public void show_state(){
		System.out.println("�����˵�����");
	}
}

class meetenemystate implements dogstate {
	public void show_state(){
		System.out.println("��У�������ȥ��ҧ����");
	}
}

class meetfriendstate implements dogstate {
	public void show_state(){
		System.out.println("�ζ�β�ͣ���ʾ��ӭ");
	}
}

class meetanotherdog implements dogstate {
	public void show_state(){
		System.out.println("��Ϸ");
	}
}

class dog {
	dogstate state;
	public void show(){
		state.show_state();
	}
	
	public void set_state(dogstate s){
		state =s ;
	}
}
public class checkdogstate {

	public static void main(String[] args) {
		dog d =new dog();
		d.set_state(new softlystate());
		System.out.printf("��������ǰ:");
		d.show();
		d.set_state(new meetenemystate());
		System.out.printf("����������:");
		d.show();
		d.set_state(new meetfriendstate());
		System.out.printf("����������:");
		d.show();
		d.set_state(new meetanotherdog());
		System.out.printf("������ͬ��:");
		d.show();
		
	}

}
