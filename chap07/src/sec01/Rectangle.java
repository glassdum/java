package sec01;

class Rectangle extends Shape {
	int radius;
	int radius2;
	
	public Rectangle(int radius, int radius2) {
		this.radius = radius;
		this.radius2 = radius2;
	}
	
	public void draw() {
		System.out.println("사각형을 그리다.");
	}
	
	public double findArea() {
		return radius * radius2;
	}
}
