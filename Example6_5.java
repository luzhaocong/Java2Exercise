interface speakhello {
	void speak_hello();
}

class chinese implements speakhello {
	public void speak_hello() {
		System.out.println("�й���ϰ���ʺ����ã��Է�����");
	}
}

class english implements speakhello {
	public void speak_hello() {
		System.out.println("Ӣ����ϰ���ʺ����ã��������� ");
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
