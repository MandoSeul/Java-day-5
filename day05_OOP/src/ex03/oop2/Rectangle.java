package ex03.oop2;

public class Rectangle {
	int x, y ,x2, y2;


	// setter and getter
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}

	
	
	// constructor
	public Rectangle() {
		
		x = 10;
		y = 10;
		x2 = 20;
		y2 = 20;
		
	}

	public Rectangle(int x, int y) {
	
		this.x = x;
		this.y = y;
	}
	
	// output method
	
	public void display(){
		System.out.println(x+","+y+","+x2+","+y2);
	}
}
