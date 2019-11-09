import java.util.Calendar;

class calendarbean {
	int year = 0, month = 0;

	public void set_year(int year) {
		this.year = year;
	}

	public void set_month(int month) {
		this.month = month;
	}

	public String[] get_calendar() {
		String[] a = new String[42];
		Calendar rili = Calendar.getInstance();
		rili.set(year, month - 1, 1);
		int week_day = rili.get(Calendar.DAY_OF_WEEK) - 1;
		int day = 0;
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
			day = 31;
		if (month == 4 || month == 6 || month == 9 || month == 11)
			day = 30;
		if (month == 2) {
			if ((year % 4 == 0) && (year % 100 != 0) || (year % 400) == 0)
				day = 29;
			else
				day = 28;
		}
		for (int i = 0; i < week_day; i++)
			a[i] = " ";
		for (int i = week_day, n = 1; i < week_day + day; i++) {
			a[i] = String.valueOf(n);
			n++;
		}
		for (int i = week_day + day; i < a.length; i++) {
			a[i] = " ";
		}
		return a;

	}
}

public class Example8_16 {

	public static void main(String[] args) {
		calendarbean cb = new calendarbean();
		cb.set_year(2022);
		cb.set_month(6);
		String[] a = cb.get_calendar();
		char[] str = "日一二三四五六".toCharArray();
		for (char c : str)
			System.out.printf("%8c", c);
		for (int i = 0; i < a.length; i++) {
			if (i % 7 == 0)
				System.out.println("");
			System.out.printf("%4s", a[i]);
		}
	}

}
