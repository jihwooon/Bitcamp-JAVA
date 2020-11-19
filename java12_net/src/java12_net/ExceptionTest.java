
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {
	Scanner scan = new Scanner(System.in);

	public ExceptionTest() {
	}

	public void start() {
		try {
			// �μ��� �Է¹޾� ��, ��, ��, ���� ���ϴ� ���α׷��� �ۼ��Ѵ�.
			System.out.println("ù��° ��=");
			int n1 = scan.nextInt(); // -------------------- InputMismatche
			System.out.println("�ι�° ��=");
			int n2 = scan.nextInt();// ---------------------

			int hap = n1 + n2;
			int cha = n1 - n2;
			int gob = n1 * n2;
			int mok = n1 / n2;// ---------------- ArithmeticException : ����� 0���� ������ ���ܹ߻�

			System.out.println("��:" + hap + ",����:" + cha + ",��:" + gob + ",������:" + mok);

			String names[] = { "ȫ�浿", "�̼���", "�������" };
			// 3
			names[names.length] = "��������";

			for (int i = 0; i < names.length; i++) {
				System.out.println("names[" + i + "]=" + names[i]);
			}

		} catch (InputMismatchException ime) {
			// System.out.println(ime.getMessage());
			// ime.printStackTrace();
			System.out.println("���ڸ� �Է��Ͽ��� �մϴ�.");
		} catch (ArithmeticException ae) {
			// System.out.println(ae.getMessage());
			// ae.printStackTrace();
			System.out.println("�ι�° ���� 0�� �����ϰ� �Է��ϼ���...");
		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("�迭�� index�� �߸����Ǿ����ϴ�." + ae.getMessage());
		} finally {
			// try ������ ���๮�� ���� �߻��� ������� ������ ����Ǵ� �����̴�.
			System.out.println("finally: ���ܿ� ������� ������ �����...");
		}

		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}

	public static void main(String[] args) {
		new ExceptionTest().start();
		System.out.println("���α׷��� ����Ǿ����ϴ�.main");

	}

}

/*
 * try{
 * 
 * ���ܹ߻��� ���ɼ��� �ִ� �ڵ带 ǥ���Ѵ�.
 * 
 * }catch(InputMismatchException e) { system.out.print �߻��� ���������� ���� �̵��ϴ� ��
 * 
 * }catch() {
 * 
 * 
 * }finally {
 * 
 * 
 * 
 * }
 * 
 * 
 */
