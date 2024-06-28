package selfTest;

interface Countable3 {
	void count();
}

class Bird3 implements Countable3 {
	String name;
	int a = 2;
	
	Bird3(String name) {
		this.name = name;
	}
	
	public void count() {
		System.out.printf("%s가 %d마리 있다.\n",name,a);
	}
	
	void fly() {
		System.out.printf("%d마리 %s가 날아간다.\n",a,name);
	}
}

class Tree3 implements Countable3 {
	String name;
	int a = 5;
	
	Tree3(String name) {
		this.name = name;
	}
	
	public void count() {
		System.out.printf("%s가 %d그루가 있다.\n",name,a);
	}
	
	void ripen() {
		System.out.printf("%s에 열매가 잘 익었다.\n",name);
	}
}



public class Test003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Countable3[] m = {
				new Bird3("뻐꾸기"),new Bird3("독수리"),new Tree3("사과나무"),new Tree3("밤나무")
		};
		for (Countable3 e : m) {
			e.count();
			}
		for (int i = 0; i < m.length; i++) {
			if(m[i] instanceof Bird3) {
				((Bird3)m[i]).fly();
			} else {
				((Tree3)m[i]).ripen();
			}
			
		}
		
	}

}
