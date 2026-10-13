package FunctionalInterface;

import java.util.function.UnaryOperator;

public class BFI4 {
	
	public void TestUnaryOperator(int n,UnaryOperator<Integer>op) {
		int res = op.apply(n);
		System.out.println(n+" --> "+res);
	}
	
	public void main(String args[]) {
		
		UnaryOperator<Integer>op1 = (x)->(x*x);
		UnaryOperator<Integer>op2 = (x)->(x*x*x);
		
		TestUnaryOperator(2,op1);
		TestUnaryOperator(3,op1);
		TestUnaryOperator(4,op1);
		
		System.out.println("===================================");
		
		TestUnaryOperator(2,op2);
		TestUnaryOperator(3,op2);
		TestUnaryOperator(4,op2);
		
		
	}
}

