package ExceptionHandling;
import java.util.Scanner;

public class TestEx {
	
	public static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {
//		double result = Ex1.divide(10, 0);
//		System.out.println(result);
//		try {
//			System.out.print("Enter your Value");
//			double d = sc.nextDouble();
//			System.out.printf("\n Done");
//			
//		}
//		catch(Throwable obj) {
//			obj.getMessage();
//		}
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		System.out.println(a/b);

	}

}
