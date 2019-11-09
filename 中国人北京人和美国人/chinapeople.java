package 中国人北京人和美国人;

public class chinapeople extends people {
	public void speak_hello() {
		System.out.println("您好");
	}

	public void average_height() {
		height = 168.78;
		System.out.println("中国人的平均身高:" + height + "厘米");
	}

	public void average_weight() {
		weight = 65;
		System.out.println("中国人的平均体重是:" + weight + "千克");
	}

	public void china_gongfu() {
		System.out.println("坐如钟，站如松，睡如弓");
	}
}
