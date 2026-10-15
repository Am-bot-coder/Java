package MultiThreading.Synchronization;
//Error
public class s1 {
	
	public static void main(String[] args) throws InterruptedException {
		Account acc = new Account(1,1000);
		
		class T1 extends Thread{
			@Override
			public void run() {
				for(int i = 0;i<1000;i++) {
					acc.deposite(1000);
				}
			}
		}
		
		class T2 extends Thread{
			@Override
			public void run() {
				for(int i = 0;i<1000;i++) {
					acc.withdraw(1000);
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
