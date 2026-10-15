package MultiThreading.CreatingThread;

class MyRunnable implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("t2->"+i);
			d.delay(1000);
		}
		
	}
	
}

public class RunnableThread {

	public static void main(String[] args) throws InterruptedException {
		MyRunnable r1 = new MyRunnable();
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r1);
		t1.start();
		t2.start();
		Thread.sleep(5000);
		
		System.out.println("Ready Or Not");

	}

}


//t->1
//t->1



//t->2
//t->2
//t->3
//t->3
//t->4
//t->4
//t->5
//t->5
//Ready Or Not
//t->6
//t->6
//t->7
//t->7
//t->8
//t->8
//t->9
//t->9
//t->10
//t->10

