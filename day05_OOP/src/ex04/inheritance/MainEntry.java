package ex04.inheritance;

public class MainEntry {
	public static void main(String[] args) {
		Point pt = new Point();	//객체 생성 - > 메모리 할당 , 생성자 함수 자동 호출
		pt.disp();
		System.out.println("상속 확인");
		Circle cir = new Circle();
		cir.disp();
		Rectangle rec = new Rectangle();
		rec.setX(10); rec.setX2(20); rec.setY(10); rec.setY2(20);
		rec.disp();
	}
}
