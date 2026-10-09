package Day5;

public class Singlton {
	static Singlton obj = new Singlton();
	
	private Singlton() {
		
	}
	public static Singlton getInitialize() {
//		Singlton obj = new Singlton();
		return obj;
	}
}
