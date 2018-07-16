package ex05.inheritancePrac;

public class Rectangle extends Point {
	private int x2, y2;

	public Rectangle() {
		x2 = 200; y2 = 300;
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
	public void display(){
		System.out.println(x+","+y+","+x2+","+y2);
	}
}
