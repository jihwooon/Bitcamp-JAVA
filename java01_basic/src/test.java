import java.util.Scanner;

class test
	{
	public static void main(String[] args) 	{
		
		Scanner scan = new Scanner(System.in);
		System.out.println("������");
		 
			System.out.print("���� =");
				int age = scan.nextInt();
			System.out.print("����(1:����. 2:����)");
				int gender = scan.nextInt();
			System.out.print("Ű =");
				int tall = scan.nextInt();
			System.out.print("����ü�� =");
				int weight = scan.nextInt();
					
				
			double Standardwight = 0.90;
				if(gender == 1 && age>=35) {
					Standardwight = (tall - 100)*0.95;
				}
				else if(gender == 2 && age<=35){
					Standardwight = (tall - 100)*0.85;
				}
				System.out.println("ǥ��ü�� = "+Standardwight);
				
			System.out.println((weight/Standardwight)* 100);
			

	}//public end
}//class end
