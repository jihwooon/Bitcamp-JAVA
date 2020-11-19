import java.util.Scanner;

public class test {
	int dan;
	
	public test() {}
		Scanner s;
		String name;
		
		public int getDan(String msg) {
			Scanner scan =new Scanner(System.in);
			System.out.print(msg + "=");
			int dan = scan.nextInt();
			return dan;
		}
	
	public void danOutput(int dan) {
		for(int i = 2; i <=9; i++)  {
			calcurator(i,dan);
			
		}
	}

	public void calcurator(int i, int dan) {
		int result = dan*i;
		System.out.println(dan + "*" + i + "=" + result);
		
	}
	public void stardan() {
		int dan = getDan("´ÜÀÔ·Â");
		danOutput(dan);
	}
	
}
