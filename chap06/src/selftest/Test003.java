package selftest;

class Girl3 {
	protected String name;
	void show() {
		System.out.println(name + "는 자바 초보자이다.");
	}
	Girl3(String name){
		this.name = name;
	}
}

class GoodGirl3 extends Girl3 {
	void show() {
		System.out.println(name + "는 자바를 잘한다.");
	}
	GoodGirl3(String name){
		super(name);
	}
}

class BestGirl3 extends GoodGirl3 {
	void show() {
		System.out.println(name + "는 자바를 무지하게 잘한다.");
	}
	BestGirl3(String name){
		super(name);
	}
}
public class Test003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Girl3[] girls = {new Girl3("갑순이"), new GoodGirl3("콩쥐"), new BestGirl3("황진이")};
		
		for(Girl3 g : girls) {
			g.show();
		}
	}

}
