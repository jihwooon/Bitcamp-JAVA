class ForTest05 
{
	public static void main(String[] args) 
	{
		//break : �ݺ��� ����
		//continue : �ݺ��� �ѹ� �ǳ� �ٱ�

		int sum = 0;
		for(int i=1; i<=1000; i++) {
			sum += i;
			if(sum>1000){
				System.out.println(i+"-->"+sum);
				break;
			}
			System.out.println("aaaaaaa");
		}
	System.out.println("end...");
	
	}

}
