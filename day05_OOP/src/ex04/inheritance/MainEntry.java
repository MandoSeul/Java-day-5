package ex04.inheritance;

public class MainEntry {
	public static void main(String[] args) {
		Point pt = new Point();	//��ü ���� - > �޸� �Ҵ� , ������ �Լ� �ڵ� ȣ��
		pt.disp();
		System.out.println("��� Ȯ��");
		Circle cir = new Circle();
		cir.disp();
		Rectangle rec = new Rectangle();
		rec.setX(10); rec.setX2(20); rec.setY(10); rec.setY2(20);
		rec.disp();
	}
}
