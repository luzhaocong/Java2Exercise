package Example6_2;

interface showmessage {

	void show_brand(String s);
}

class tv implements showmessage {
	public void show_brand(String s) {
		System.out.println(s);
	}
}

class pc implements showmessage {
	public void show_brand(String s) {
		System.out.println(s);
	}
}

public class Example6_2 {

	public static void main(String[] args) {
		showmessage sm;
		sm = new tv();
		sm.show_brand("�����Ƶ��ӻ�");
		sm = new pc();
		sm.show_brand("���뱼��5008pc��");
	}

}
