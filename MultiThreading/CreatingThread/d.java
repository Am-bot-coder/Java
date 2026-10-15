package MultiThreading.CreatingThread;

public class d extends Thread{
	public static void delay(int i) {
		try {
			sleep(i);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
