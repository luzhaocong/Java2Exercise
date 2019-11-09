package 家中的电视;

public class mainclass {

	public static void main(String[] args) {
		tv haier_tv = new tv();
		haier_tv.set_channel(5);
		System.out.println("haierTV的频道是"+haier_tv.get_channel());
		family zhangfamily = new family();
		zhangfamily.buy_tv(haier_tv);
		System.out.println("zhangsanfamily开始看电视节目");
		zhangfamily.see_tv();
		int m=2;
		System.out.println("zhangsanfamily将电视更换到"+m+"频道");
		zhangfamily.remote_control(m);
		System.out.println("haierTV的频道是"+zhangfamily.hometv.get_channel());
		System.out.println("zhangsanfamily再看电视节目");
		zhangfamily.see_tv();
	}

}
