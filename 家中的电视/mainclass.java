package ���еĵ���;

public class mainclass {

	public static void main(String[] args) {
		tv haier_tv = new tv();
		haier_tv.set_channel(5);
		System.out.println("haierTV��Ƶ����"+haier_tv.get_channel());
		family zhangfamily = new family();
		zhangfamily.buy_tv(haier_tv);
		System.out.println("zhangsanfamily��ʼ�����ӽ�Ŀ");
		zhangfamily.see_tv();
		int m=2;
		System.out.println("zhangsanfamily�����Ӹ�����"+m+"Ƶ��");
		zhangfamily.remote_control(m);
		System.out.println("haierTV��Ƶ����"+zhangfamily.hometv.get_channel());
		System.out.println("zhangsanfamily�ٿ����ӽ�Ŀ");
		zhangfamily.see_tv();
	}

}
