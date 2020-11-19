
import java.util.Scanner;

public class Test3
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String title[] = {"이름","국어","영어","수학","총점","평균","석차"};
		
		System.out.print("학생수=");
		int cnt = scan.nextInt();

		String names[] = new String[cnt];//이름저장할 배열
		double jumsu[][] = new double[cnt+2][6];//정수를 저장할 배열
		
		//데이터입력
			for(int i=0; i<cnt; i++) {// i=0,1,2,3,4 -> 학생수만큼 회전
				System.out.print(title[0]+"=");//이름
				scan.nextLine();
				names[i] = scan.nextLine();

				//세과목의 정수
				for(int j=1; j<=3; j++) {// j=1,2,3	0,1,2
					System.out.print(title[j]+"=");
					jumsu[i][j-1] = scan.nextInt();
					
			}
			System.out.println();
		}
	//개인별 총점, 평균, 과목별 총점
		for(int r=0; r<cnt; r++){// 1,2,3,4,5....
			for(int c=0; c<3; c++){// 0,1,2
				jumsu[r][3]=jumsu[r][3] + jumsu[r][c]; //개인총점
				jumsu[cnt][c] = jumsu[cnt][c] + jumsu[r][c];//과목별 총점

			}
			jumsu[r][4] = jumsu[r][3] / 3; //개인별 평균
		}

		for(int c=0; c<=2; c++) {
			jumsu[cnt+1][c] = jumsu[cnt][c] / cnt;
			
		}
	//석차 구하기 : 자신의 점수보다 높은 점수의 수를 구한다.
		for(int r=0; r<cnt; r++){//0,1,2,3,4
			
			for(int r2=0; r2<cnt; r2++) {//0,1,2,3,4
				// 내총점				상대방총점
				if(jumsu[r][3] < jumsu[r2][3]){
					jumsu[r][5]++;
				
				}
			}
			jumsu[r][5]++;
		}

	//출력----------------------------
	for(String t : title){//제목출력
		System.out.print(t+"\t");
	}
		System.out.println();
		//이름과 점수 출력
			for(int i=0; i<jumsu.length; i++){//0,1,2,3,4,5,6
				if(i==cnt){
					System.out.print("총점\t");
				
				}else if(i == cnt+1) {
					System.out.print("평균\t");
				
				}else{
					System.out.print(names[i]+"\t"); //이름
				}
				for(int j=0; j<jumsu[i].length; j++){
						System.out.printf("%.1f\t",jumsu[i][j]);//소수점 같은거 보기 힘들 때 쓸 수 있다.
				
				}
				System.out.println();
		}
	}
}
/*

*/