package sec02;

public class ClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Keyboard k = new Keyboard("Logitech");
		
		Class c = k.getClass();
		System.out.println(c);
		System.out.println(c.getName());
		System.out.println(c.getSimpleName());
		System.out.println(c.getTypeName());
		System.out.println(c.getPackage().getName());
	}

}
