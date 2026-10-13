package FunctionalInterface;

import java.util.function.Consumer;

public class BFI6 {
	
	public void TestConsumer(int n,Consumer<Integer>op) {
		op.accept(n);
	}
	
	public void main(String args[]) {
		
		Consumer<Integer>op1 = (x)->System.out.println("Value is "+x);
		Consumer<Integer>op2 = (x)->System.out.println("Value is "+(-x));
		
		TestConsumer(10, op2);
		
		
		System.out.println("===================================");
		
		TestConsumer(10, op1);
		
	}
}

