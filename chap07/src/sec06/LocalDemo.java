package sec06;

public class LocalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class Eagle extends Bird {
			public void move() {
				System.out.println("독수리가 난다~~~.");
			}
		}
		
		Bird e = new Eagle();
		e.move();
	}

}
