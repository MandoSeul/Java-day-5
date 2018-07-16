package ex04.inheritance;

public class Point {
	protected int x,y ; // ����� �ϰ� �Ǹ� ��ȣ��� - ����ϴ� �ڼյ鿡�� ����
	//��������� ���ǵǾ� �־�� �ڵ�ȭ ����

	
	public Point() { //default constructor
	System.out.println("hi");
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
	
	public void disp(){
		System.out.println(x+","+y);
	}
}

class Circle extends Point{ // ��� - extends, ���� ��Ӹ� ����
	private int r;

	public Circle() {
		System.out.println("no");
	}
	public Circle(int r) {
		this.r = r;
		x=100; y=300;
	}
	public Circle(int x, int y, int r) {
		System.out.println("mannnn");
		this.x= x;
		this.y= y;
		this.r= r;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}
	public void disp(){
		System.out.println(x+","+y+","+r);
	}
}

class Rectangle extends Point{
	private int x2, y2;

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
	public void disp(){
		System.out.println(x+","+y+","+x2+","+y2);
	}
}