package ex07.Employee;

import java.util.Scanner;

public class EmployeeProg {
	private String name, pos, dept, phon;
	public EmployeeProg() {

		Scanner sc = new Scanner(System.in);
		System.out.println(" �̸��� �Է��ϼ��� : ");
		name = sc.nextLine();
		System.out.println(" ������ �Է��ϼ��� : ");
		pos = sc.nextLine();
		System.out.println(" �μ��� �Է��ϼ��� : ");
		dept = sc.nextLine();
		System.out.println(" �ڵ��� ��ȣ�� �Է��ϼ��� : ");
		phon = sc.nextLine();
	}
	 public void display(){
		 System.out.println("�̸� : " + name + " ���� : "+pos+" �μ� : "+ dept +" �ڵ��� ��ȣ : " + phon);
	 }
}
