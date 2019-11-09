package 中国人北京人和美国人;

public class beijingpeople extends chinapeople {
	public void average_height() {
		height = 172.5;
		System.out.println("北京人的平均身高是:" + height + "厘米");
	}

	public void average_weight() {
		weight = 70;
		System.out.println("北京人的平均体重是:" + weight + " kg");
	}

	public void beijing_opera() {
		System.out.println("花脸，青衣，花旦和老生");
	}
}
