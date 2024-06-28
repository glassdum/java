package sec05;

class Icon {
	interface Touchable {
		void touch();
	}
}

public class InnerInterfaceDemo implements Icon.Touchable {
	
	public void touch() {
		System.out.println("아이콘을 터치한다.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Icon.Touchable btn = new InnerInterfaceDemo();
		btn.touch();
	}

}
