package Day3;
import java.util.Scanner;

class Employee2{
	private int empid;
	private String name;
	private double salary;
	Scanner sc = new Scanner(System.in);
	
	public Employee2(){
		this.empid=0;
		this.name = "Unassigned";
		this.salary = 0.0;}
	public int getEmpid() {
		return this.empid;
	}
	public String getName() {
		return this.name;
	}
	public double getSalary() {
		return this.salary;
	}
	
	public void setEmpid() {
		System.out.println("Enter the empid -> ");
		empid = sc.nextInt();
	}
	public void setName() {
		System.out.println("Enter the name -> ");
		sc.nextLine();
		name = sc.nextLine();
	}
	public void setSalary() {
		System.out.println("Enter the Salary -> ");
		salary = sc.nextDouble();
	}
	public void acceptRecord(){
		
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

public class GetterSetter {

	public static void main(String[] args) {
		Employee2 e1 = new Employee2();
		e1.printRecord();
		e1.acceptRecord();
		System.out.println("Value of Empid : "+e1.getEmpid());
		System.out.println("Value of Name : "+e1.getName());
		System.out.println("Value of Salary : "+e1.getSalary());
		
		e1.setEmpid();
		e1.setName();
		e1.setSalary();
		e1.printRecord();

	}

}
