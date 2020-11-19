import java.util.Scanner;
class IfElseIf01 
{
	public static void main(String[] args) 
	
	{
	Scanner scan = new Scanner(System.in);
		
		int kor, eng, mat;
		System.out.print("국어=");
		kor= scan.nextInt();
		System.out.print("수학=");
		eng= scan.nextInt();
		System.out.print("영어=");
		mat= scan.nextInt();
	

	double sum = kor + eng + mat;
	double avg = sum/3;
	char grade;
	
	//학점
	if(avg>=90 && avg<=100){ //case 1:
		grade = 'A';
	} else if(avg <90 && avg >=80) { //case 2:
		grade = 'B';
	} else if(avg <80 && avg >=70) { //case 3:
		grade = 'C';
	} else if(avg <70 && avg >=60) { //case 4:
		grade = 'D';
	} else if(avg <60 &&avg >=0)   { //case 5:
		grade = 'F';
	} else {// dafault :
		grade = 'X';
	}
	
	if(grade !='X') {
		System.out.printf("총점=%f\n평균=%f\n학점=%s\n",sum,avg,grade);
}else {
		System.out.println("점수가 잘못입력하였습니다.");
}
	}
}
/*
//3과목의 점수를 입력받아
// 총점, 평균(실수:double),학점을 출력하라.()

90~100 A
80~89  B
70~79  C
60~69  D
0 ~59  F

실행
국어 =
영어 =
수학 =
총점 = 
평균 =
학점 = 

	}
*/