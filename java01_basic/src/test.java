import java.util.Scanner;

class test
	{
	public static void main(String[] args) 	{
		
		Scanner scan = new Scanner(System.in);
		System.out.println("실행결과");
		 
			System.out.print("나이 =");
				int age = scan.nextInt();
			System.out.print("성별(1:남성. 2:여성)");
				int gender = scan.nextInt();
			System.out.print("키 =");
				int tall = scan.nextInt();
			System.out.print("현재체중 =");
				int weight = scan.nextInt();
					
				
			double Standardwight = 0.90;
				if(gender == 1 && age>=35) {
					Standardwight = (tall - 100)*0.95;
				}
				else if(gender == 2 && age<=35){
					Standardwight = (tall - 100)*0.85;
				}
				System.out.println("표준체중 = "+Standardwight);
				
			System.out.println((weight/Standardwight)* 100);
			

	}//public end
}//class end
