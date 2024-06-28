package selftest;

class Girl2 {
	private String name;
	void show() {
		System.out.println("그녀는 자바 초보자이다.");
	}
	Girl2(){
		
	}
	Girl2(String name){
		
	}
}

class GoodGirl2 extends Girl2 {
	void show() {
		System.out.println("그녀는 자바를 잘한다.");
	}
}

class BestGirl2 extends GoodGirl2 {
	void show() {
		System.out.println("그녀는 자바를 무지하게 잘한다.");
	}
}

public class Test002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Girl2 g1 = new Girl2();
		Girl2 g2 = new GoodGirl2();
		GoodGirl2 gg = new BestGirl2();
		
		g2.show();
		
		gg.show();
	}

}
