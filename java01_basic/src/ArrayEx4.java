import java.util.Scanner;


public class ArrayEx4
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("실행");
			
		
		
		System.out.print("학생수=");
			int student = scan.nextInt();	
			
			int [][] matrix = new int[student][7];
			
			for(int i = 0; i<=matrix.length; i++) {
				
				for(int j = 0; j<=matrix[i].length; j++) {
		
				System.out.print("이름=");
					matrix [i][j] = scan.nextInt();
				System.out.print("국어=");
					matrix [i][j] = scan.nextInt();
				System.out.print("영어=");
					matrix [i][j] = scan.nextInt();
				System.out.print("수학=");
					matrix [i][j] = scan.nextInt();
					
				}//for 문
		System.out.println("이름"+"\t"+"국어"+"\t"+"영어"+"\t"+"수학"+"\t"+"총점"+"\t"+"평균"+"\t"+"석차");
						
			
		/*		
		
				
				//입력
				for(int r=0; r<= matrix.length; r++){
					System.out.print(r+1+name);
						if() {
						
						}else if()
										
						for(int c=0; c<=matrix[r].length; c++) {
							
							
				
					System.out.print(sum+" ");
						avg = (double)sum / martrix[r].length;
							System.out.pritnf("%2f\n",avg);
			
			
					}//행 배열 입력 완료
				System.out.println();
			*/
			}					
		}//for end
	}
	//pubilc
//class

/*
학생수 입력받고 3과목점수를 입력받은 후 개인별 총점, 평균, 석차를 구하고
각 과목별 총점과 평균을 구하라.
단, 석차순으로 출력

실행
학생수=3
이름 = 홍길동
국어=90 kor
영어=80 eng
수학=90 mas

이름=박길동
:
:
이름		국어		영어		수학		총점		평균		석차
홍길동	90		80		90		260		_		_
박길동	_		_		_		_		_		_
_		_		_		_		_		_		_


*/