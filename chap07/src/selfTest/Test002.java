package selfTest;

abstract class Countable2 {
	abstract void count();
	
	protected String name;
	protected int num;
	
	public Countable2(String name, int num) {
		this.name = name;
		this.num = num;
	}
	
	
}

class Bird2 extends Countable2 {
	public Bird2(String name, int num) {
		super(name,num);
	}
	
	public void count() {
		System.out.printf("%s가 %d마리 있다.\n",name,num);
	}
	
	void fly() {
		System.out.printf("%d마리 %s가 날아간다.\n",num,name);
	}
}

class Tree2 extends Countable2 {
	public Tree2(String name, int num) {
		super(name,num);
	}
	
	public void count() {
		System.out.printf("%s가 %d그루가 있다.\n",name,num);
	}
	
	void ripen() {
		System.out.printf("%d그루 %s에 열매가 잘 익었다.\n",num,name);
	}
}



public class Test002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Countable2[] m = {
				new Bird2("뻐꾸기",5),new Bird2("독수리",2),new Tree2("사과나무",10),new Tree2("밤나무",7)
		};
		for (Countable2 e : m) {
			e.count();
		}
		for (int i = 0; i < m.length; i++) {
			if(m[i] instanceof Bird2) {
				((Bird2)m[i]).fly();
			} else {
				((Tree2)m[i]).ripen();
			}
		}
		
	}

}
