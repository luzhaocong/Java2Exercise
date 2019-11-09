class RedCowFrom{
	static String form_name;
	RedCow cow;
	RedCowFrom(){
		
	}
	RedCowFrom(String s){
		cow=new RedCow(150,112,5000);
		form_name=s;
	}
	public void show_mess(){
		cow.speak();
	}
	class RedCow {
		String cow_name="红牛";
		int height,weight,price;
		RedCow(int h,int w,int p){
			height=h;
			weight=w;
			price=p;
		}
		void speak(){
			System.out.println("偶是"+cow_name+",身高："+height+"cm 体重："+weight+"kg ,生活在"+form_name);
		}
	}
}
public class Example7_1 {
	public static void main(String[] args) {
		RedCowFrom form = new RedCowFrom("红牛农场");
		form.show_mess();
		form.cow.speak();
	}

}
