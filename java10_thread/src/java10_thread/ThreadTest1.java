package java10_thread;

public class ThreadTest1 extends Thread {
	int i=1;
	String title;
	
	public ThreadTest1() {
	
	}
	public ThreadTest1(String title) {
		this.title = title;
		
	}
	
//	public void numOutput() {
//		while(true) {
//			System.out.println(title+"-->"+i++);
//		
//			
//
//		}				
//	}
	public void run() {
		while(true) {
			System.out.println(title+"-->"+i++);
		
		}	
	}	
}

// Thread Ŭ������ �̿��� ������ ����
// Thread Ŭ������ ����� �޾� �����尡 �����Ǿ�� �ϴ� �����
// run()�޼ҵ忡 �������̵� �Ѵ�.
// start()�޼ҵ�� ������ �����췯�� �����屸�� ����Ѵ�.
// 



