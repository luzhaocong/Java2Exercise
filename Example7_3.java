interface speak_hello{
	void speak();
}
class hello_machine{
	public void turn_on(speak_hello hello){
		hello.speak();
	}
}
public class Example7_3 {
	public static void main(String[] args) {
		hello_machine machine=new hello_machine();
		machine.turn_on(new speak_hello(){
			public void speak(){
				System.out.println("hello,you are welcome!");
			}
		});
		machine.turn_on(new speak_hello(){
			public void speak(){
				System.out.println("你好，欢迎光临！");
			}
		});
	}

}
