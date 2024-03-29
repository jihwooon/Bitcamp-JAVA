import java.util.Scanner;
import java.util.Arrays;

class Lotto 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		do{
			System.out.print("게임수=");
			int game = scan.nextInt();//게임수
			//게임을 생성
			//로또번호 저장할 배열
			
			for(int cnt =1; cnt<=game; cnt++) {//게임수 만큼 반복
				int[] lotto = new int[7];
				for(int i = 0; i<lotto.length; i++){//0
					lotto[i] = (int)(Math.random()*(45-1+1)+1);
					//   12
					
					//중복검사
					for(int j=0; j<i; j++){//
						if(lotto[j] == lotto[i]){
							i--;
							break;
						}
					}
				}	
			
			System.out.println();
			/*//정렬 후
			for(int row=0; row<lotto.length-2; row++){
				for(int col =0; col<lotto.length-2; col++) {
					if(lotto[col] > lotto[col+1]) {
						int temp = lotto[col];
						lotto[col] = lotto[col+1];
						lotto[col+1] = temp;
					}
				}
			}
			*/
			Arrays.sort(lotto,0,6);
		 //정렬 후
		  /*System.out.print(cnt+"게임=[");
			for(int k=0; k<lotto.length; k++){//보너스 빼고 출력
				System.out.print(lotto[k]);
				
				if(k==5){
					System.out.print("], ");
				}else{
					System.out.print(", ");
					}
				}
				*/
					System.out.print(Arrays.toString(Arrays.copyOfRange(lotto,0,6)));
					System.out.println(", bonus="+lotto[6]);
			}

			System.out.print("계속하시겠습니까(1:예, 2:아니요)?");
			int qa = scan.nextInt();
			 if(qa!=1){//프로그램 종료=> 1인 아닌경우
				System.out.println("프로그램이 종료되었습니다..");
				break;
			 
			 }
		}while(true); // do end
	}
}
	
