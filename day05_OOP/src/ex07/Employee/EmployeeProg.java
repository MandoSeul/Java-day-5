package ex07.Employee;

import java.util.Scanner;

public class EmployeeProg {
	private String name, pos, dept, phon;
	public EmployeeProg() {

		Scanner sc = new Scanner(System.in);
		System.out.println(" 이름을 입력하세요 : ");
		name = sc.nextLine();
		System.out.println(" 직위를 입력하세요 : ");
		pos = sc.nextLine();
		System.out.println(" 부서를 입력하세요 : ");
		dept = sc.nextLine();
		System.out.println(" 핸드폰 번호를 입력하세요 : ");
		phon = sc.nextLine();
	}
	 public void display(){
		 System.out.println("이름 : " + name + " 직위 : "+pos+" 부서 : "+ dept +" 핸드폰 번호 : " + phon);
	 }
}
