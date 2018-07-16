package ex01.overload;

public class ArgumentVariable {
	public static void main(String[] args) {
		add(1); // ������ ������
		add(1,2,3,4,5);
		add(1,5,7,8,9,5,8);
		//�ڷ��� Ÿ���� ������ ������ ���ڰ� �ٸ� ��(����,������ �ٸ���)
		add("a","b","c");
		add("hi ","my ","name ","is ", " who ");
		
	}
	//�������̸� ���� �Լ��� �������� ���ڸ� ����� �� ����.
	public static void add(int...x){
		//...�� �������� �迭�̴�.
		int sum = 0;
		for(int i =0; i<x.length;i++){
			sum +=x[i];
		}
		System.out.println("int sum = " + sum);
	}

	public static void add(String...str){ // �������� �迭
		String sum = " ";
		for(int i=0; i<str.length;i++){
			sum +=str[i];
		}
		System.out.println("String num = " + sum);
	}
}

