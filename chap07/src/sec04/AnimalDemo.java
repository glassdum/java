package sec04;

interface Animal{
	void sound();
}

class Dog implements Animal{
	public void sound() {
		System.out.println("멍멍~~");
	}
}

class Cuckoo implements Animal{
	public void sound() {
		System.out.println("뻐꾹~~");
	}
}

public class AnimalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		Cuckoo c = new Cuckoo();
		
		makeSound(d);
		makeSound(c);
	}
	
	static void makeSound(Animal a) {
		a.sound();
	}

}
