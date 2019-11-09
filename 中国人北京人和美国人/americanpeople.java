package 中国人北京人和美国人;

public class americanpeople extends people {
	public void speak_hello() {
		System.out.println("how do you do");
	}

	public void average_height() {
		height = 176;
		System.out.println("American's averageheight:" + height + "cm");
	}

	public void average_weight() {
		weight = 75;
		System.out.println("American's average weight:" + weight + " kg");
	}

	public void american_boxing() {
		System.out.println("直拳，勾拳，组合拳");
	}
}
