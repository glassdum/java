package sec02;

public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hi";
		System.out.println(s.hashCode());
		
		s = s + "!";
		
		System.out.println(s.hashCode());
		
		StringBuilder sd = new StringBuilder("hi");
		System.out.println(sd.hashCode());
		sd = sd.append("!");
		System.out.println(sd.hashCode());
		
		System.out.println(sd.replace(0, 2, "Good bye").insert(0, "Java, "));
	}

}
