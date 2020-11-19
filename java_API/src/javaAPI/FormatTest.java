package javaAPI;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FormatTest {

	public FormatTest() {// ǥ���ϴ� ������ �ٲ�
		try {////
				// ȭ����� ǥ��
			int money = 5127428;// 5,127,428��
			DecimalFormat fmt = new DecimalFormat("#,###��");

			String moneyStr = fmt.format(money); // 51,284��
			System.out.println("moneyStr=" + moneyStr);

			// ȭ����� ���ڸ� ���ڷ� ��ȯ
			NumberFormat fmt2 = NumberFormat.getNumberInstance();

			Number num = fmt2.parse(moneyStr);
			int numInt = num.intValue();
			System.out.println("numInt=" + numInt);

		} catch (Exception e) {

			// ��¥�� �̿��� ����
			Calendar now = Calendar.getInstance();
			SimpleDateFormat dateFmt = new SimpleDateFormat("yyyy-MM-dd:mm:ss");
			String dateStr = dateFmt.format(now.getTime());
			System.out.println("dataStr="+dateStr);
		}
	}

	public static void main(String[] args) {
		new FormatTest();
	}

}
