package ex06.ScoreProgram;

public class Score {
	private int kor=0 , eng=0 , com=0 , total;
	private char grade;
	private String name;
	private double avg=0;
	
	//setter/getter
	
	//constructor
	public Score() {
		
	}
	public Score(int kor, int eng, int com, String name) {
		this.kor = kor; this.eng = eng; this.com = com; this.name = name;
		total = kor + eng + com;
		avg = ((double)total/3);
		if((avg<=100)&&(avg>=90))
			grade = 'A';
		else if((avg<=89)&&(avg>=80))
			grade = 'B';
		else if((avg<=79)&&(avg>=70))
			grade = 'C';
		else if((avg<=69)&&(avg>=60))
			grade = 'D';
		else
			grade = 'F';
		}
		
	// output
		public void display(){
		
		System.out.println(name +"¥‘¿« º∫¿˚«•");
		System.out.println("kor : " + kor + "\teng : " + eng + "\tcom : " + com );
		System.out.printf("total : " + total +"\taverage : %.2f " ,avg );
		System.out.println();
		System.out.println("your Grade is  " + grade);
	}
	
}
