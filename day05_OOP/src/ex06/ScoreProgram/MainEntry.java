package ex06.ScoreProgram;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		int kor=0 , eng=0 , com=0 ;
		String name;	
		Scanner sc = new Scanner(System.in);
		System.out.println(" �̸��� �Է��ϼ��� : ");
		name = sc.nextLine();
		
		do{
			System.out.println(" ���������� �Է��ϼ��� : ");
			kor = sc.nextInt();
		}while(kor<0 || kor>100);
		do{
			System.out.println(" ��ǻ�������� �Է��ϼ��� : ");
			com = sc.nextInt();
		}while(com<0 || com>100);
		do{
			System.out.println(" ���������� �Է��ϼ��� : ");
			eng = sc.nextInt();
		}while(eng<0 || eng>100);
		
		Score prog= new Score(kor, eng, com, name);
		prog.display();
	
}
}
