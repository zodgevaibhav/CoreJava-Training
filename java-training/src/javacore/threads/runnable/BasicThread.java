package javacore.threads.runnable;

public class BasicThread {
	public static void main(String[] args) throws InterruptedException {
		MyThread t1 = new MyThread();
		t1.threadId = "1";

		MyThread t2 = new MyThread();
		t2.threadId = "2";

		Thread th1 = new Thread(t1);
		th1.start();
		Thread th2 = new Thread(t2);
		
		System.out.println("After thread startes");
		
		System.out.println("Name - " +th1.getName());
		System.out.println("ID - " +th1.getId());
		System.out.println("Priority - " +th1.getPriority());
		System.out.println("Active Count - " +th1.activeCount());
		System.out.println("State - " +th1.getState());
		System.out.println("Is Daemon - " +th1.isDaemon());
		System.out.println("Is Daeon - " +th1.isDaemon());
		
		th2.start();
		//Thread.sleep(10000);
	}
}

class MyThread implements Runnable {
	String threadId;

	public void run() {
		for (int i = 0; i <= 10000; i++) {
			System.out.println("Thread " + threadId + " - " + i+" Thread active count - "+Thread.getAllStackTraces());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
