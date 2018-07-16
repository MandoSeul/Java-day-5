package ex01.overload;

public class ArgumentVariable {
	public static void main(String[] args) {
		add(1); // 정수형 데이터
		add(1,2,3,4,5);
		add(1,5,7,8,9,5,8);
		//자료형 타입이 같은데 인자의 숫자가 다른 것(길이,갯수가 다른것)
		add("a","b","c");
		add("hi ","my ","name ","is ", " who ");
		
	}
	//가변길이를 통해 함수에 여러개의 인자를 사용할 수 있음.
	public static void add(int...x){
		//...이 가변길이 배열이다.
		int sum = 0;
		for(int i =0; i<x.length;i++){
			sum +=x[i];
		}
		System.out.println("int sum = " + sum);
	}

	public static void add(String...str){ // 가변길이 배열
		String sum = " ";
		for(int i=0; i<str.length;i++){
			sum +=str[i];
		}
		System.out.println("String num = " + sum);
	}
}

