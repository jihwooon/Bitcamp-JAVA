class Operator01

{
	public static void main(String[] args) 
	{
		//산술연산자 : +, -, *, /, %(나머지)
		int num1 = 25;
		int num2 = 4;

		int result = num1 + num2;
		System.out.printf("%d + %d = %d\n",num1,num2, result);

		int mod = num1 % num2; 
		System.out.printf("%d %s %d = %d\n", num1, "%", num2, mod);

		//증감연산자 : ++(1씩증가), -(1씩감소)
		num1++;
		System.out.printf("++ = %d\n", num1);
		
		//num1--; // num1 = num1-1;	num-=1;
		System.out.printf("-- = %d\n", num1);
		
		int r1 = num1++ + 7 - 3;  //num1 =26  ,r1 = 29
		System.out.printf("num1=%d, r1=%d\n", num1,r1);

		//대입연산자 : +=,-=, /=, %=, *=
		
		num1 = num1 / 3; // num1 /= 3;
		int r2 = num1 / 3;
		
		System.out.printf("num1/3,%d\n",num1,r2);

	/*  
		int a = 10				
		int b = 5 + a++;		int d = 7 - --a;
		int c = 5 + ++a;		int f = 7 + a--;
		
		
	*/

	}
}
