class gugudan2007 
{
	public static void main(String[] args) 
	{
		System.out.println("\t\t=������=");

		for(int i=1; i<=9; i+=3) {//�ٱ� for��
			System.out.print("=="+i+"��"+"=="+"\t");
			System.out.print("=="+(i+1)+"��"+"=="+"\t");
			System.out.println("=="+(i+2)+"��"+"=="+"\t");
		
			for(int j=2; j<10; j++) {//for ��ø��
				System.out.print(i+"*"+j+"="+i*j+"\t");
				System.out.print((i+1)+"*"+j+"="+(i+1)*j+"\t");
				System.out.print((i+2)+"*"+j+"="+(i+2)*j+"\t");
				System.out.println("\n");
			}
			System.out.println("\n");
		}
		
			
		}
	
	}


