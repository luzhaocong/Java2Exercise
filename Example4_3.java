class Xiyoujirenwu{
	float height,weight;
	String head,ear;
	void speak(String s){
		head = "����ͷ";
		System.out.println(s);
	}
	
}
public class Example4_3 {

	public static void main(String[] args) {
		Xiyoujirenwu zhubajie,sunwukong;
		zhubajie = new Xiyoujirenwu();
		sunwukong = new Xiyoujirenwu();
		zhubajie.height = 1.80f;
		zhubajie.head = "��ͷ";
		zhubajie.ear = "һ˫�����";
		sunwukong.height = 1.62f;
		sunwukong.weight = 1000f;
		sunwukong.head = "����ƮƮ";
		System.out.println("��˽�����:"+zhubajie.height);
		System.out.println("��˽��ͷ:"+zhubajie.head);
		System.out.println("����յ����:"+sunwukong.height);
		System.out.println("����յ�����:"+sunwukong.weight);
		System.out.println("����յ�ͷ:"+zhubajie.head);
		zhubajie.speak("����������Ȣϱ��");
		System.out.println("��˽����ڵ�ͷ:"+zhubajie.head);
		sunwukong.speak("��������1000�����ƭ��˽䱳��");
		System.out.println("��������ڵ�ͷ:"+sunwukong.head);
		
		
	}

}
