import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Database {
//	private Utils utils = Utils.getInstance();
//
//	Scanner scan = new Scanner(System.in);
//	// 회원 정보
//	private Map<String, UserVO> user = new HashMap<String, UserVO>();
//	// 도서 정보
//	private Map<String, BookVO> book = new HashMap<String, BookVO>();
//	// 체크 리스트
//	// private Array<CheckOut> list= new ArrayList<CheckOut>();

	public Database() {}	
	
	//회원정보
	public static HashMap<String, UserVO> allmember(){
		HashMap<String, UserVO> am = new HashMap<String, UserVO>();
		am.put("1111", new UserVO("1111","seoul","1234","홍길동","010-5555-7783"));
		am.put("2222", new UserVO("2222","hanoi","2222","강감찬","010-1234-7283"));
		am.put("3333", new UserVO("3333","kim123","3333","강동원","010-5666-8833"));
		am.put("4444", new UserVO("4444","jun123","4444","곽도원","010-7986-4567"));
		am.put("5555", new UserVO("1234","ahn333","5555","정우성","010-9696-1234"));
		am.put("6666", new UserVO("6666","kang234","6666","유연석","010-7823-5552"));
		am.put("7777", new UserVO("7777","num123","7777","한지민","010-2043-9999"));
		am.put("8888", new UserVO("8888","ook123","8888","김태희","010-9561-2333"));
		am.put("9999", new UserVO("9999","qwe333","9999","비룡","010-4321-3456"));
		return am;
	}
	
	// 도서 목록 
	public static HashMap<String, BookVO> allview() {
		HashMap<String, BookVO> al = new HashMap<String, BookVO>();
		al.put("0001", new BookVO("0001", "정의란 무엇인가?", "마이클샌들", "믿음사"));
		al.put("0002", new BookVO("0002", "노화의 종말", "데이비드 A.싱클레어.매슈 D.러플랜트 ", "부키"));
		al.put("0003", new BookVO("0003", "코로나 투자 전쟁 ", "김일구", "여의도 클라스"));
		al.put("0004", new BookVO("0004", "타이탄의 도구들", "팀페리스", "토네이도"));
		al.put("0005", new BookVO("0005", "1만 시간의 재발견", "안데르스 에릭슨", "비지니스 북스"));
		al.put("0006", new BookVO("0006", "파타고니아, 파도가 칠 때는 서핑을 ", "이본 쉬나드", "라이팅하우스"));
		al.put("0007", new BookVO("0007", "스케일 : 생물 도시 기업의 성장과 죽음에 관한 보편 법칙 ", "제프리 웨스트", "김영사"));
		al.put("0008", new BookVO("0008", "머신 플랫폼 크라우드", "에릭브라욜프슨", "청림출판"));
		al.put("0009", new BookVO("0009", "기브 앤 테이크", "애덤 그랜트", "생각연구소"));
		al.put("0010", new BookVO("0010", "메이커스 앤드 테이커스", "라나 포루하", "부키"));
		return al;

	}
	//public String searchForBook(String word, String key) {
		
	
}
	

	

