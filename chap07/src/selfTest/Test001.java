package selfTest;

interface Countable {
	void count();
}

class Bird implements Countable {
	String name;
	
	Bird(String name) {
		this.name = name;
	}
	
	public void count() {
		int a = 2;
		System.out.printf("%s가 %d마리 있다.\n",name,a);
	}
	
	void fly() {
		
	}
}

class Tree implements Countable {
	String name;
	
	Tree(String name) {
		this.name = name;
	}
	
	public void count() {
		int a = 5;
		System.out.printf("%s가 %d그루가 있다.\n",name,a);
	}
	
	void ripen() {
		
	}
}



public class Test001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Countable[] m = {
				new Bird("뻐꾸기"),new Bird("독수리"),new Tree("사과나무"),new Tree("밤나무")
		};
		for (Countable e : m) {
			e.count();
			for (int i = 0; i < m.length; i++) {
				if(m[i] instanceof Bird) {
					((Bird)m[i]).fly();
				} else {
					((Tree)m[i]).ripen();
				}
			}
		}
		
	}

}
