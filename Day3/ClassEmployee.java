package Day3;
import java.util.Scanner;

class Employee{
	private int empid;
	private String name;
	private double salary;
	
	public Employee(){
		this.empid=0;
		this.name = "Unassigned";
		this.salary = 0.0;}
	public void acceptRecord(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the empid -> ");
		empid = sc.nextInt();
		System.out.println("Enter the name -> ");
		sc.nextLine();
		name = sc.nextLine();
		System.out.println("Enter the Salary -> ");
		salary = sc.nextDouble();}
	public void printRecord(){
		System.out.println("EmpId : "+empid);
		System.out.println("Name : "+name);
		System.out.println("salary : "+salary);}	
}

public class ClassEmployee {

	public static void main(String[] args) {
		Employee e1 = new Employee(); //e1 is reference which create on stack
		//actual object is created on heap;
		e1.printRecord();
		e1.acceptRecord();
		e1.printRecord();

	}

}
