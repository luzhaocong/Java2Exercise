interface speakhello {
	void speak_hello();
}

class chinese implements speakhello {
	public void speak_hello() {
		System.out.println("中国人习惯问候语：你好，吃饭了吗？");
	}
}

class english implements speakhello {
	public void speak_hello() {
		System.out.println("英国人习惯问候语：你好，天气不错 ");
	}
}

class kindhello {
	public void lookhello(speakhello hello) {
		hello.speak_hello();
	}
}

public class Example6_5 {

	public static void main(String[] args) {
		kindhello kindhello = new kindhello();
		kindhello.lookhello(new chinese());
		kindhello.lookhello(new english());

	}

}
