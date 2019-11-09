package 公司支出的总薪水;

abstract class employee {
	public abstract double enrnings();
}

class year_worker extends employee {
	public double enrnings() {
		return 12000;
	}
}

class month_worker extends employee {
	public double enrnings() {
		return 12 * 2300;
	}
}

class week_worker extends employee {
	public double enrnings() {
		return 52 * 780;
	}
}

class company {
	employee[] em;
	double salaries = 0;

	company(employee[] em) {
		this.em = em;
	}

	public double salaries_pay() {
		salaries = 0;
		for (int i = 0; i < em.length; i++) {
			salaries += em[i].enrnings();
		}
		return salaries;
	}
}

public class company_salary {
	public static void main(String[] args) {
		employee[] em = new employee[29];
		for (int i = 0; i < em.length; i++) {
			if (i % 3 == 0)
				em[i] = new week_worker();
			else if (i % 3 == 1)
				em[i] = new month_worker();
			else if (i % 3 == 2)
				em[i] = new year_worker();
		}
		company com = new company(em);
		System.out.println("公司薪水总额：" + com.salaries_pay() + "元");
	}

}
