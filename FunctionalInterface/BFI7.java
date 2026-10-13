package FunctionalInterface;


import java.util.function.Supplier;

public class BFI7 {
	
	public void TestSupplier(Supplier<Integer>op) {
		System.out.println(op.get());
	}
	
	
	public void main(String args[]) {
		
		Supplier<Integer>op1 = () -> 10;
		Supplier<Integer>op2 = () -> 20;
		
		TestSupplier(op2);
		
		
		System.out.println("===================================");
		
		TestSupplier(op1);
		
	}
}

