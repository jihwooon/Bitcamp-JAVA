import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class CalculatorEvent implements ActionListener {
	JTextField tf;
	String oper = "";// ������ ����
	private double result;

	public CalculatorEvent(JTextField tf) {
		this.tf = tf;
	}


	public void actionPerformed(ActionEvent ae) {
		String eventTxt = ae.getActionCommand();
		switch (eventTxt) {
		case "End":
			System.exit(0);
			break;
		case "BackSpace":
			setBackSpace();
			break;
		case ".":
			setPoint();
			break;
		case "+":
		case "-":
		case "*":
		case "/":
			setOperator(eventTxt);
			break;
		case "=":
			setCalculator();
		case "Clear":
			setClear();
			break;

		default:// ���ڹ�ư�� ���
			setNumber(eventTxt);
		}
	}

	private void setClear() {
		result = 0.0;
		oper = "";
		tf.setText("0.0");

	}

	private void setCalculator() {
		double secondNum = Double.parseDouble(tf.getText());
		switch (oper) {
		case "+":
			result = result + secondNum;
			break;
		case "-":
			result = result + secondNum;
			break;
		case "*":
			result = result + secondNum;
			break;
		case "/":
			result = result + secondNum;
			break;
		}
		tf.setText(Double.toString(result));// ����� tfǥ�� String.valueOf(result)
		oper = "";// ������ �����
	}

	private void setOperator(String eventTxt) {
		oper = eventTxt;// ������
		result = Double.parseDouble(tf.getText());
		tf.setText("");// tf�ʱ�ȭ

	}

	public void setPoint() {
		// �Ҽ��� �ִ��� Ȯ���Ѵ�.
		String txt = tf.getText();// 898.98 798
		if (txt.indexOf(".") == -1) {
			tf.setText(txt + ".");
		}
	}

	public void setNumber(String eventTxt) {
		String tfTxt = tf.getText();
		if (tfTxt.equals("0.0")) {
			tf.setText(eventTxt);
		} else {
			tf.setText(tfTxt + eventTxt);
		}
	}

	public void setBackSpace() {
		try {
			String txt = tf.getText();//
			String cutTxt = txt.substring(0, txt.length() - 1);
			tf.setText(cutTxt);
		} catch (StringIndexOutOfBoundsException sioobe) {
		}
		System.out.println("�����߻���.");
	}
}
