package MultiThreading.Synchronization;

//Synchornize Block

public class SynchronizeBlock {
	
	public static void main(String[] args) throws InterruptedException {
		Account acc = new Account(1,1000);
		
		class T1 extends Thread{
			@Override
			public void run() {
				for(int i = 0;i<1000;i++) {
					synchronized (acc) {
						acc.deposite(1000);
					}
				}
			}
		}
		
		class T2 extends Thread{
			@Override
			public void run() {
				for(int i = 0;i<1000;i++) {
					synchronized (acc) {
						acc.withdraw(1000);
					}
				}
			}
		}
		
		
		
		T1 t1 = new T1();
		T2 t2 = new T2();
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
		System.out.println(acc.getAmmount());
	}
	
}
