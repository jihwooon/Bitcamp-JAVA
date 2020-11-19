import java.util.Scanner;

public class natcr {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
			System.out.println("실행");
			
			System.out.print("단입력") ;
			int data= scan.nextInt();
			
			
		 for(int i=5; i<=9; i++) {
			 int result = data * i;
			 System.out.println(data +"*"+ i + "="+(data*i));
		 }
		
		 
	
	}
}