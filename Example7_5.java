class bank_exception extends Exception{
	String message;
	public bank_exception(int m,int n){
		message="入账资金"+m+"是负数或支出"+n+"是正数,不符合系统要求";
	}
	public String warn_mess(){
		return message;
	}
}

class bank{
	private int money;
	public void income(int in,int out) throws bank_exception{
		if(in<=0||out>=0||in+out<=0)
			throw new bank_exception(in,out);
		int net_income=in+out;
		System.out.printf("本次计算的纯收入是：%d元\n",net_income);
		money+=net_income;
	}
	public int get_money(){
		return money;
	}
}
public class Example7_5 {
	public static void main(String[] args) {
		bank ba=new bank();
		try{
			ba.income(200,-100);
			ba.income(300, -100);
			ba.income(400, -100);
			System.out.printf("银行目前有%d元\n", ba.get_money());
			ba.income(200, 100);
			ba.income(99999, -100);
		}
		catch (bank_exception e){
			System.out.println("计算收益的过程出现如下问题");
			System.out.println(e.warn_mess());
		}
		System.out.printf("银行目前有%d元\n", ba.get_money());
	}

}
