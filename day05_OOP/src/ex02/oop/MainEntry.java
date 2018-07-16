package ex02.oop;
class Point{
	private int x,y; // �������
	
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
	private int x,y,r;//����Ǽ�
	public Circle(){ // default �������Լ� - ������� �ʱ�ȭ ���
		x=10;
		y=20;
		r=5;
	}
	
	public Circle(int r){ //  �������Լ� - ������� 1��
		this.r=r;

	}
	
	public Circle(int x, int y, int r){ //  �������Լ� - ������� 1��
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
public class MainEntry { // main�� �ִ� �������� public�� ������.
	public static void main(String[] args) {
//		Point pt = new Point();
//	//	pt.x = 100; pt.y=20; // ���� ������ �����ϸ� - default �� �̷��� ��� ���� �� ��.
//		//private �ϴ� ���� ����
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
