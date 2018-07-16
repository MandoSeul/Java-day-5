package ex02.oop;
class Point{
	private int x,y; // 멤버변수
	
	//setter,getter method
	public void setX(int xx){
		x=xx;
	}
	public int getX(){
		return x;
	}
	public void setY(int yy){
		y=yy;
	}
	public int getY(){
		return y;
	}
	public void display(){
//		System.out.println(getX() + "," + getY());
		System.out.println(x + "," + y);

	}
}
class Circle{
	private int x,y,r;//멤버션수
	public Circle(){ // default 생성자함수 - 멤버변수 초기화 담당
		x=10;
		y=20;
		r=5;
	}
	
	public Circle(int r){ //  생성자함수 - 멤버변수 1개
		this.r=r;

	}
	
	public Circle(int x, int y, int r){ //  생성자함수 - 멤버변수 1개
		this.x=x;
		this.y=y;
		this.r=r;

	}
	public void CsetX(int x){
		this.x=x;
	}
	public void CsetY(int y){
		this.y=y;
	}
	public void CsetR(int r){
		this.r=r;
	}
	public int CgetX(){
		return x;
	}
	public int CgetY(){
		return y;
	}
	public int CgetR(){
		return r;
	}
	
	public void display(){
		System.out.println(x+","+y+","+r);
	}
}
public class MainEntry { // main이 있는 곳에서만 public이 들어가야함.
	public static void main(String[] args) {
//		Point pt = new Point();
//	//	pt.x = 100; pt.y=20; // 접근 지정자 생략하면 - default 라서 이렇게 사용 가능 한 것.
//		//private 하는 순간 오류
//	//	System.out.println(pt.x+pt.y);
//		pt.setX(40);
//		pt.display();
//		
//		System.out.println(pt.getX()+","+pt.getY());
		Circle cir = new Circle();
		Circle cir2 = new Circle(4);
		Circle cir3 = new Circle(4,6,8);
		
		cir.CsetX(33);
		cir.display();
		cir2.display();
		cir3.display();
		
	}
}
