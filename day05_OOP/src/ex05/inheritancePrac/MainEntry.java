package ex05.inheritancePrac;

public class MainEntry {
	public static void main(String[] args) {
		Point pt = new Point();
		Circle cir = new Circle();
		Rectangle rec = new Rectangle();
		cir.setX(100);
		pt.display();
		cir.display();
		rec.display();
	}
}
