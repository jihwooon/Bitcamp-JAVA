package java10_thread;

public class ThreadTest2 implements Runnable{
	int i=0;
	String title;
	public ThreadTest2() {
	
	}

	public	ThreadTest2(String title) {
		this.title = title;
		
		
	}
	//Â¦¼ö¸¸ Ãâ·Â
	
	public void run() {
		for(int i=2; i<=Integer.MAX_VALUE; i+=2) {
			System.out.println(title+"="+i);
		
	}
}
}