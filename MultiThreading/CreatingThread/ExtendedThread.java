package MultiThreading.CreatingThread;

class Mythread extends Thread{
	

	@Override
	public void run() {
		for(int i =1;i<=5;i++) {
			System.out.println("t1-->"+i);
			d.delay(1000);		
		}
	}
}

class Mythread2 extends Thread{
	@Override
	public void run() {
		for(int i =1;i<=5;i++) {
			System.out.println("t2-->"+i);
			d.delay(1000);	
		}
	}


}

public class ExtendedThread {

	public static void main(String[] args) {
		Mythread t1 = new Mythread();
		Mythread2 t2 = new Mythread2();
		
		t1.start();
		t2.start();
		System.out.println("MultiThreads");

	}

}

