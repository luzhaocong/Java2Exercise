package 中国人北京人和美国人;

public class example {

	public static void main(String[] args) {
		chinapeople cp = new chinapeople();
		americanpeople ap = new americanpeople();
		beijingpeople bp = new beijingpeople();
		cp.speak_hello();
		ap.speak_hello();
		bp.speak_hello();
		cp.average_height();
		ap.average_height();
		bp.average_height();
		cp.average_weight();
		ap.average_weight();
		bp.average_weight();
		cp.china_gongfu();
		ap.american_boxing();
		bp.china_gongfu();
	}

}
