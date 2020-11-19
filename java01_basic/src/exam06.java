
public class exam06 {

	public static void main(String[] args) {
	
		for(int i=1; i<10; i++) {
			System.out.print("=="+i+"´Ü"+"=="+"\t");
			System.out.print("=="+(i+1)+"´Ü"+"=="+"\t");
			System.out.println("=="+(i+2)+"´Ü"+"=="+"\t");
			for(int j=2; j<10; j++) {
				System.out.print(i+"*"+j+"="+i*j+"\t");
				System.out.print((i+1)+"*"+j+"="+(i+1)*j+"\t");
				System.out.print((i+2)+"*"+j+"="+(i+2)*j);
				System.out.print("\n");

			}
			System.out.println();
		}
	
	}

}
