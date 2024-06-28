package sec06;

public class SelfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		oddPrint(x);
	}
	
	public static void oddPrint(int n) {
		for(int i = 0; i < n; i++) {
			if(i%2 == 0) {
				continue;
			}
			System.out.println(i);
		}
//		if(n%2==0) {
//			System.out.println();
//		} else
//		System.out.println(n);
	}

}
