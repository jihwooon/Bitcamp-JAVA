class Variable01 {

	public static void main(String[] args) 
	{ //주석 : 설명
	   /* 

			여러줄 주석문
			여러줄 주석문

		/*
		//변수 선언 = 기본데이터형, 레퍼런스형(객체형)
		// 정수 : byte(1byte), shoart(2byte), int(4byte기본타입), long(8byte)
		// 상수 : 100, 50
	}
}
/* 
변수 생성 규칙
1. 소문자로 시작한다.
2. 첫번째 문자는 영어, _, $ 만 가능
3. 특수문자(_, $제외)는 사용할 수 없습니다.
4. 합성어일 결우 두번째 단어의 첫번째 문자는 대문자로 시작한다.
*/

//데이터형    변수   상수
	byte kroJumsu = 100;
	int engJumsu = 50;

	int hap = kroJumsu + engJumsu;
	//클래서.변수.메소드		3가지 메소드 print() : 출력후 줄 안바꿈. println() : 출력 후 줄바꿈, printf()
	
	System.out.println("국어="+kroJumsu); //java api
	System.out.println("영어="+engJumsu);
	System.out.println("hap="+hap);
	System.out.println(kroJumsu +" + "+engJumsu+" = "+hap);
	
	//		typecasting(형 변환)
	byte num = (byte)130; //byte<int (byte : -128 ~ 127), *int 강제 변화 시 제대로 게산 됬었는지 꼭 확인

	System.out.println("num="+num);

	int num2 = num; //큰 타입은 굳이 변환 시킬 필요가 없다.
	System.out.println("num2="+num2);

	
	}
}