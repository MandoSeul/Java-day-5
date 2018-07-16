package ex01.overload;

public class MainEntry {

	
	public static void intplus(int x, int y){
		System.out.println(x+y);
	}
	public static void doubleplus(double x, double y){
		System.out.println(x+y);
	}
	public static void multiplus(int x, int y,float f, double d){
		System.out.println(x+y+f+d);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doubleplus(4.5,5.5);
		intplus(100,20);
		multiplus(1,3,45.6f,34.7);
		
	}

}
