package Example5_2;

class university{
	void enter_rule(double math,double english,double chinese) {
		double total = math+english+chinese;
		if(total <=180)
			System.out.println(total+"�����ﵽ��ѧ¼ȡ��");
		else
			System.out.println(total+"����δ�ﵽ��ѧ¼ȡ��");
		
	}
}

class importantuniversity extends university {
	void enter_rule(double math,double english,double chinese) {
		double total = math+english+chinese;
		if(total >=220)
			System.out.println(total+"�����ﵽ�ص��ѧ¼ȡ��");
		else
			System.out.println(total+"����δ�ﵽ�ص��ѧ¼ȡ��");

	}
}
public class Example5_4 {

	public static void main(String[] args) {
		double math=62,english=76.5,chinese=67;
		importantuniversity imun = new importantuniversity();
		imun.enter_rule(math, english, chinese);
		math=91;
		english=82;
		chinese=86;
		imun.enter_rule(math, english, chinese);
	}

}
