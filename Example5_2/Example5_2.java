package Example5_2;

class people{
	private int aver_height = 166;
	public int get_aver_height() {
		return aver_height;
	}
}

class china_people extends people{
	int height;
	public void set_height(int h) {
		height = h;
	}
	public int get_height() {
		return height;
	}
}
public class Example5_2 {

	public static void main(String[] args) {
		china_people zhangsan = new china_people();
		System.out.println("�������δ�̳�averageheight��ֵ��:"+zhangsan.get_aver_height());
		zhangsan.set_height(178);
		System.out.println("��������ʵ������height��ֵ��:"+zhangsan.get_height());
	}

}
