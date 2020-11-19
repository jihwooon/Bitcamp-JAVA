
public class ConstractorTestMain {

	public static void main(String[] args) {
		
		ConstractorTest ct1= new ConstractorTest();
		ConstractorTest ct2= new ConstractorTest(999);
		ConstractorTest ct3= new ConstractorTest(555, "홍길동","777-8888");
		
		ct1.prn();
		ct2.prn();
		ct3.prn();
		ConstractorTest ct4 = new ConstractorTest("세종대왕","010-5656-7070",333);
		ct4.prn();
		
		byte data[] = {65, 69, 70,78,66};
		String dataobj = new String(data);
		System.out.println("dataobj="+ dataobj);//아스키 코드
	}
}
