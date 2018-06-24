package javacore.threads.thread_extend;

public class BasicThread {

	public static void main(String[] args) {
		MyThread th = new MyThread();
		th.start();
		//th.start();  // java.lang.IllegalThreadStateException
	}

}

class MyThread extends Thread {
	String threadId;

	public void run() {
		for (int i = 0; i <= 10000; i++) {
			System.out.println("Thread " + threadId + " - " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

