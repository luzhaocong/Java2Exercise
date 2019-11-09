class Xiyoujirenwu{
	float height,weight;
	String head,ear;
	void speak(String s){
		head = "歪着头";
		System.out.println(s);
	}
	
}
public class Example4_3 {

	public static void main(String[] args) {
		Xiyoujirenwu zhubajie,sunwukong;
		zhubajie = new Xiyoujirenwu();
		sunwukong = new Xiyoujirenwu();
		zhubajie.height = 1.80f;
		zhubajie.head = "大头";
		zhubajie.ear = "一双大耳朵";
		sunwukong.height = 1.62f;
		sunwukong.weight = 1000f;
		sunwukong.head = "长发飘飘";
		System.out.println("猪八戒的身高:"+zhubajie.height);
		System.out.println("猪八戒的头:"+zhubajie.head);
		System.out.println("孙悟空的身高:"+sunwukong.height);
		System.out.println("孙悟空的重量:"+sunwukong.weight);
		System.out.println("孙悟空的头:"+zhubajie.head);
		zhubajie.speak("俺老猪我想娶媳妇");
		System.out.println("猪八戒现在的头:"+zhubajie.head);
		sunwukong.speak("老孙我重1000斤，我想骗猪八戒背我");
		System.out.println("孙悟空现在的头:"+sunwukong.head);
		
		
	}

}
