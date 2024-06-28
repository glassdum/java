package sec03;

public class Computer implements Controllable {
	public void turnOn() {
		System.out.println("Computer를 켠다.");
	}
	
	public void turnOff() {
		System.out.println("Computer를 끈다.");
	}
}
