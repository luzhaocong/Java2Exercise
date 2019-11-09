import java.util.*;

public class Example8_15 {
	public static void main(String args[]) {
		Calendar ca = Calendar.getInstance();
		ca.setTime(new Date());
		int year = ca.get(Calendar.YEAR), month = ca.get(Calendar.MONTH) + 1, day = ca.get(Calendar.DAY_OF_MONTH),
				hour = ca.get(Calendar.HOUR_OF_DAY), minute = ca.get(Calendar.MINUTE), second = ca.get(Calendar.SECOND);
		System.out.print("现在的时间是：");
		System.out.print("" + year + "年" + month + "月" + day + "日");
		System.out.println(" " + hour + "时" + minute + "分" + second + "秒");
		int y = 2012, m = 9, d = 1;
		ca.set(y, m - 1, d);
		long time1 = ca.getTimeInMillis();
		y = 2016;
		m = 7;
		day = 1;
		ca.set(y, m - 1, d);
		long time2 = ca.getTimeInMillis();
		long subday = (time2 - time1) / (1000 * 60 * 60 * 24);
		System.out.println("" + new Date(time2));
		System.out.println("" + new Date(time1));
		System.out.println("相隔" + subday + "天");

	}
}
