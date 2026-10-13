package LambdaFunctions;

import java.util.Arrays;
import java.util.Comparator;

//Class Anonymous

public class I2 {
	
		Comparator<Employee>obj = new Comparator<Employee>() {		
		@Override
		public int compare(Employee o1, Employee o2) {
			return Integer.compare(o1.getId(), o2.getId());
		}
		};
		
	public void main(String args[]) {
		Employee [] arr = new Employee[] {
				new Employee(1,"Ayush"),
				new Employee(2,"Pruthviraj"),
				new Employee(7,"Akash"),
				new Employee(4,"Prajwal"),
				new Employee(9,"Sujal"),
				new Employee(8,"Amol")
		};
		
		for(Employee e : arr) {
			System.out.println(e.toString());
		}
		
		System.out.println("====================================");
		
		Arrays.sort(arr, obj);
		for(Employee e : arr) {
			System.out.println(e.toString());
		}
		
		
		
		
		
		
	}
	
	
}

