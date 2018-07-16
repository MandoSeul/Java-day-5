package ex03.oop2;

public class Point {
	private int x,y ;
	//멤버변수가 정의되어 있어야 자동화 가능

	
	public Point() { //default constructor
	
	}

	
	public Point(int x) {

		this.x = x;
	}


	//getter and setter
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
	
	public void display(){
		System.out.println(x+","+y);
	}
}
