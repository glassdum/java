package sec04;

public class PrintfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 97;
		String s = "Java";
		double f = 3.14f;
		System.out.printf("%d\n",i);
		System.out.printf("%o\n",i);
		System.out.printf("%x\n",i);
		System.out.printf("%c\n",i);
		System.out.printf("%5d\n",i);
		System.out.printf("%05d\n",i);
		System.out.printf("%s\n",s);
		System.out.printf("%5s\n",s);
		System.out.printf("%-5s\n",s);
		System.out.printf("%f\n",f);
		System.out.printf("%e\n",f);
		System.out.printf("%4.1f\n",f);
		System.out.printf("%04.1f\n",f);
		System.out.printf("%-4.1f\n",f);
		

		char c1 = 'a';
		final int ONE = 1;
		System.out.printf("(c1 + ONE) = %5s\n",c1+ONE);
		
	}

}
