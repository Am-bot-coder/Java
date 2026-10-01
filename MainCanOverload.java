
public class MainCanOverload {

	public static void main(String[] args) {
		System.out.println("This main is only called by JVM");
		main(10,20);
		main(10.2,20.8);

	}
	public static void main(int a, int b) {
		System.out.println("main is overload but only above main can called it");
		
	}

	public static void main(double a, double b) {
		System.out.println("main is overload but only (string args []  can called it");

	}


}

//This main is only called by JVM
//main is overload but only above main can called it
//main is overload but only (string args []  can called it
