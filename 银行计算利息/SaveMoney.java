package 银行计算利息;

class bank{
	int saved_money;
	int year;
	double interest;
	double interest_rate=0.29;
	public double computer_interest() {
		interest=year*interest_rate*saved_money;
		return interest;
	}
	public void set_interest_rate(double rate) {
		interest_rate=rate;
	}
}

class construction_bank extends bank {
	double year;
	public double computer_interest() {
		super.year=(int)year;
		double r =year-(int)year;
		int day=(int)(r*1000);
		double year_interest=super.computer_interest();
		double day_interest=day*0.0001*saved_money;
		interest=year_interest+day_interest;
		System.out.printf("%d元存在建设银行%d年零%d天的利息：%f元\n	",saved_money,super.year,day,interest);
		return interest;
	}
}
class bank_of_dalian extends bank {
		double year;
		public double computer_interest() {
			super.year=(int)year;
			double r =year-(int)year;
			int day=(int)(r*1000);
			double year_interest=super.computer_interest();
			double day_interest=day*0.00012*saved_money;
			interest=year_interest+day_interest;
			System.out.printf("%d元存在大连银行%d年零%d天的利息：%f元\n	",saved_money,super.year,day,interest);
			return interest;
		}

}
public class SaveMoney {

	public static void main(String[] args) {
		int amount=8000;
		construction_bank b1=new construction_bank();
		b1.saved_money=amount;
		b1.year=8.236;
		b1.set_interest_rate(0.035);
		double interest1=b1.computer_interest();
		bank_of_dalian b2=new bank_of_dalian();
		b2.saved_money=amount;
		b2.year=8.236;
		b2.set_interest_rate(0.035);
		double interest2=b2.computer_interest();
		System.out.printf("两个银行利息相差%f元\n", interest2-interest1);
	}

}
