package Day5;

public class TestSinglton {

	public static void main(String[] args) {
		Singlton obj1 = Singlton.getInitialize();
		Singlton obj2 = Singlton.getInitialize();
		
		
		if(obj1 == obj2) {
			System.out.println("Singlton Successfull");
		}
		else {
			System.out.println("Singlton UnSuccessfull");
		}
		

	}

}
