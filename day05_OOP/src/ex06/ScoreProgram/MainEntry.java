package ex06.ScoreProgram;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		int kor=0 , eng=0 , com=0 ;
		String name;	
		Scanner sc = new Scanner(System.in);
		System.out.println(" 이름을 입력하세요 : ");
		name = sc.nextLine();
		
		do{
			System.out.println(" 국어점수를 입력하세요 : ");
			kor = sc.nextInt();
		}while(kor<0 || kor>100);
		do{
			System.out.println(" 컴퓨터점수를 입력하세요 : ");
			com = sc.nextInt();
		}while(com<0 || com>100);
		do{
			System.out.println(" 영어점수를 입력하세요 : ");
			eng = sc.nextInt();
		}while(eng<0 || eng>100);
		
		Score prog= new Score(kor, eng, com, name);
		prog.display();
	
}
}
