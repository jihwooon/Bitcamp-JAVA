package liberiy_project;

import java.util.HashMap;
import java.util.Map;

public class BookHashMap {

	public BookHashMap() {

	}

	public static Map<String, BookVO> SetEmp() {
		Map<String, BookVO> map = new HashMap<String, BookVO>();
		map.put("���Ƕ� �����ΰ�", new BookVO(10, "���Ƕ������ΰ�", "����Ŭ����", "�������", "�뿩��"));
		map.put("���ڿ� ����Ű", new BookVO(20, "���ڿͳ���Ű", "�����̵���", "����", "��� ����"));
		map.put("���ǼӼ�", new BookVO(30, "���ǼӼ�", "���ȣ", "����������Ͻ�", "��� ����"));
		map.put("�ֽ� ������ �����ϱ�", new BookVO(40, "�ֽ� ������ �����ϱ�", "�����", "���", "�뿩��"));
		map.put("��Ÿ��Ͼ�, �ĵ��� ĥ ���� ������", new BookVO(50, "��Ÿ��Ͼ�, �ĵ��� ĥ ���� ������", "�̺� ������", "������ �Ͽ콺", "��� ����"));
		return map;
	}

}
