package javacore.threads.runnable;

public class MultipleBasicsThreadUsingLoop {

	public static void main(String[] args) throws InterruptedException {
		
		for(int i=0;i<=50;i++)
		{
			new Thread(new MyThread()).start();
		}
		//Thread.sleep(10000);
		
		System.out.println("********************************** "+Thread.activeCount());
	}

}
