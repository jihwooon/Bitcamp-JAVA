package liberiy_project;

import java.util.HashMap;
import java.util.Map;

public class BookHashMap {

	public BookHashMap() {

	}

	public static Map<String, BookVO> SetEmp() {
		Map<String, BookVO> map = new HashMap<String, BookVO>();
		map.put("정의란 무엇인가", new BookVO(10, "정의란무엇인가", "마이클샌델", "와이즈베리", "대여중"));
		map.put("한자와 나오키", new BookVO(20, "한자와나오키", "이케이도준", "인플", "재고 있음"));
		map.put("돈의속성", new BookVO(30, "돈의속성", "김승호", "스노우폭스북스", "재고 있음"));
		map.put("주식 무작정 따라하기", new BookVO(40, "주식 무작정 따라하기", "윤재수", "길벗", "대여중"));
		map.put("파타고니아, 파도가 칠 때는 서핑을", new BookVO(50, "파타고니아, 파도가 칠 때는 서핑을", "이본 쉬나드", "라이팅 하우스", "재고 있음"));
		return map;
	}

}
