package LambdaFunctions;

import java.util.Arrays;


//Using arrow Functions more preciosely

public class I5 {
	
//	Arrays.sort(arr,(Employee o1, Employee o2) -> {
//		return Integer.compare(o1.getId(), o2.getId());
//	});
		
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
		
		Arrays.sort(arr,(o1, o2) -> Integer.compare(o1.getId(), o2.getId()));
		
		
		for(Employee e : arr) {
			System.out.println(e.toString());
		}
				
	}
	
	
}

