package FunctionalInterface;

import java.util.function.Function;


public class BFI2 {
	
	public void TestFunction(int n,Function<Integer,String>op) {
		String res = op.apply(n);
		System.out.println(res);
	}
	
	public void main(String args[]) {
		
		
		Function<Integer,String>op1 = (x)-> "The number of My car is "+x;
		Function<Integer,String>op2 = (x)-> "The number of My House is "+x;
		
		
		
		TestFunction(10,op1);
		TestFunction(55,op1);
		
		System.out.println("===================================");
		
		TestFunction(10,op2);
		TestFunction(55,op2);
		
		
	}
}

