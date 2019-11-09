package 小狗的状态;

interface dogstate{
	public void show_state();
}

class softlystate implements dogstate{
	public void show_state(){
		System.out.println("听主人的命令");
	}
}

class meetenemystate implements dogstate {
	public void show_state(){
		System.out.println("狂叫，并冲向去狠咬敌人");
	}
}

class meetfriendstate implements dogstate {
	public void show_state(){
		System.out.println("晃动尾巴，表示欢迎");
	}
}

class meetanotherdog implements dogstate {
	public void show_state(){
		System.out.println("嬉戏");
	}
}

class dog {
	dogstate state;
	public void show(){
		state.show_state();
	}
	
	public void set_state(dogstate s){
		state =s ;
	}
}
public class checkdogstate {

	public static void main(String[] args) {
		dog d =new dog();
		d.set_state(new softlystate());
		System.out.printf("狗在主人前:");
		d.show();
		d.set_state(new meetenemystate());
		System.out.printf("狗遇到敌人:");
		d.show();
		d.set_state(new meetfriendstate());
		System.out.printf("狗遇到朋友:");
		d.show();
		d.set_state(new meetanotherdog());
		System.out.printf("狗遇到同伴:");
		d.show();
		
	}

}
