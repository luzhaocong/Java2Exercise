class  battery {
	int ele;
	battery(int amount){
		ele= amount;
	}
}

class radio {
	void openradio(battery bat){
		bat.ele-=10;
	}
}
public class Example4_7 {
	public static void main(String[] args) {
		battery nanfu = new battery(100);
		System.out.println("���ڵ�صĴ������ģ�"+nanfu.ele);
		radio rad = new radio();
		System.out.println("��ʼʹ�����ڵ�أ�");
		rad.openradio(nanfu);
		System.out.println("Ŀǰ���ڵ�صĵ���Ϊ��"+nanfu.ele);
		
		
	}

}
