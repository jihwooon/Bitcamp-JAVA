import java.util.Scanner;
class IfElseIf01 
{
	public static void main(String[] args) 
	
	{
	Scanner scan = new Scanner(System.in);
		
		int kor, eng, mat;
		System.out.print("����=");
		kor= scan.nextInt();
		System.out.print("����=");
		eng= scan.nextInt();
		System.out.print("����=");
		mat= scan.nextInt();
	

	double sum = kor + eng + mat;
	double avg = sum/3;
	char grade;
	
	//����
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
		System.out.printf("����=%f\n���=%f\n����=%s\n",sum,avg,grade);
}else {
		System.out.println("������ �߸��Է��Ͽ����ϴ�.");
}
	}
}
/*
//3������ ������ �Է¹޾�
// ����, ���(�Ǽ�:double),������ ����϶�.()

90~100 A
80~89  B
70~79  C
60~69  D
0 ~59  F

����
���� =
���� =
���� =
���� = 
��� =
���� = 

	}
*/