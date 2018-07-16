package ex05.inheritancePrac;

public class Circle extends Point {
	private int r;

	
	public Circle() {
		r= 400;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}
	
	public void display(){
		System.out.println(x+","+y+","+r);
	}
}
