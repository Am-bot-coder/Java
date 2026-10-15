package MultiThreading.CreatingThread;

public class BothThreads {

	public static void main(String[] args) throws InterruptedException {
		Mythread t1 = new Mythread();
		MyRunnable rn = new MyRunnable();
		Thread t2 = new Thread(rn);
		
		System.out.println("Hello");
//		System.out.println(t1.getState() + "---"+ t2.getState());NEW---NEW
		t1.start();
		t2.start();
		
//		System.out.println(t1.getId() + "---"+ t2.getId());     26---27
//		System.out.println(t1.getName() + "---"+ t2.getName()); Thread-0---Thread-1
		
//		System.out.println(t1.getPriority() + "---"+ t2.getPriority());  5---5
		
//		System.out.println(t1.getState() + "---"+ t2.getState());    RUNNABLE---RUNNABLE
		
//		d.delay(1000);
//		System.out.println(t1.getState() + "---"+ t2.getState());    TIMED_WAITING---TIMED_WAITING
		
//		t1.join();
//		t2.join();
//		System.out.println(t1.getState() + "---"+ t2.getState());    TERMINATED---TERMINATED
		
//		System.out.println(t1.isAlive() + "---"+ t2.isAlive());   true---true
//		t1.join();
//		t2.join();
//		System.out.println(t1.isAlive() + "---"+ t2.isAlive());   false---false
		
	}

}
