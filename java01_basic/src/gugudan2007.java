class gugudan2007 
{
	public static void main(String[] args) 
	{
		System.out.println("\t\t=구구단=");

		for(int i=1; i<=9; i+=3) {//바깥 for문
			System.out.print("=="+i+"단"+"=="+"\t");
			System.out.print("=="+(i+1)+"단"+"=="+"\t");
			System.out.println("=="+(i+2)+"단"+"=="+"\t");
		
			for(int j=2; j<10; j++) {//for 중첩문
				System.out.print(i+"*"+j+"="+i*j+"\t");
				System.out.print((i+1)+"*"+j+"="+(i+1)*j+"\t");
				System.out.print((i+2)+"*"+j+"="+(i+2)*j+"\t");
				System.out.println("\n");
			}
			System.out.println("\n");
		}
		
			
		}
	
	}


