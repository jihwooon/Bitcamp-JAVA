package javaAPI;
import java.util.Arrays;

class ArraysTest
{
	public static void main(String[] args) 
	{
		//Arrays : 배열관련 클래스 
		
		int data[] = {10, 67, 25, 52, 62, 25, 5, 40, 91};

		//Arrays.sort(data); //배열의 값을 정렬
		Arrays.sort(data,0,4);//index를 기준으로 정렬범위를 지정한다. 
		System.out.println(Arrays.toString(data)); //배열의 값을 문자열로 만들어준다. 

		//배열의 복사
		int dataCopy[] = Arrays.copyOfRange(data, 2, 6);
		System.out.println(Arrays.toString(dataCopy));

		String name[] = {"홍길동", "이순신", "세종대왕", "강감찬", "김삿갓"};
		Arrays.sort(name);
		String nameStr = Arrays.toString(name);
		System.out.println(nameStr);

		
		//배열을 비교 
		int data2[] = {10, 67, 25, 52, 62, 25, 5, 40, 91};
		int data3[] = data;
		boolean boo = Arrays.equals(data,data3); //객체의 주소를 비교하여 같은지 확인 
		System.out.println(boo);



	}
}
