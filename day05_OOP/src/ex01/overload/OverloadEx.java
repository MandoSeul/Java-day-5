package ex01.overload;

public class OverloadEx {
	public static void main(String[] args) {
		plus("hi","everyone");
		plus(10,13);
		plus(13.4,65.3);
		plus(12.34);
		plus(100,"mannn");
	}

	private static void plus(int i, String string2) {
		// TODO Auto-generated method stub
		System.out.println(i+string2);
	}

	private static void plus(double d) {
		// TODO Auto-generated method stub
		System.out.println(d);
	}

	private static void plus(double d, double e) {
		// TODO Auto-generated method stub
		System.out.println(d+e);
	}

	private static void plus(String string, String string2) {
		// TODO Auto-generated method stub
		System.out.println(string+string2);
	}

	private static void plus(int i, int j) {
		// TODO Auto-generated method stub
		System.out.println(i+j);
	}
	
	
}
