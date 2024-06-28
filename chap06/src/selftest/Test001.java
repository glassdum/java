package selftest;

class Girl {
	String name;
}

class GoodGirl extends Girl {
	void show() {
		System.out.println("그녀는 자바를 잘한다.");
	}
}

class BestGirl extends GoodGirl {
	void show() {
		System.out.println("그녀는 자바를 무지하게 잘한다.");
	}
}

public class Test001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Girl g1 = new Girl();
		Girl g2 = new GoodGirl();
		GoodGirl gg = new BestGirl();
		
		gg.show();
	}

}
