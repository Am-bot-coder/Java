package Day1;
import java.util.Scanner;

public class InputOutput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int roll_number;
		String name;
		double marks;
		
		System.out.println("Enter the roll Number");
		roll_number = sc.nextInt();
		System.out.println("Enter the name");
		sc.nextLine();
		name = sc.nextLine();
		System.out.println("Enter the marks");
		marks = sc.nextDouble();
		
		System.out.println("Roll_number : "+roll_number);
		System.out.println("Name : "+name);
		System.out.println("Marks : "+marks);
		
		sc.close();

	}

}
