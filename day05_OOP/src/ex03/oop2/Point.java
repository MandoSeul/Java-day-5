package ex03.oop2;

public class Point {
	private int x,y ;
	//��������� ���ǵǾ� �־�� �ڵ�ȭ ����

	
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
