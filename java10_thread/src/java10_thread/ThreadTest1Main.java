package java10_thread;

public class ThreadTest1Main {

	public static void main(String[] args) {
//		ThreadTest1 t1 = new ThreadTest1("ù��°");
//		t1.start();

//		ThreadTest1 t2 = new ThreadTest1("�ι�°");
//		t2.start();

		ThreadTest2 t3 = new ThreadTest2("first");
		ThreadTest2 t4 = new ThreadTest2("second");

//		Thread ��ü
		Thread tt3 = new Thread(t3);
		Thread tt4 = new Thread(t4);

		tt4.setPriority(Thread.MAX_PRIORITY); // �켱����

		tt3.start();
		tt4.start();

	}
}
