package FunctionalInterface;

import java.util.function.BinaryOperator;

public class BFI5 {
	
	public void TestBinaryOperator(int n,int m,BinaryOperator<Integer>op) {
		int res = op.apply(n,m);
		System.out.println(n+" --> "+res);
	}
	
	public void main(String args[]) {
		
		BinaryOperator<Integer>op1 = (x,y)->(x*y);
		BinaryOperator<Integer>op2 = (x,y)->(x+y);
		
		TestBinaryOperator(2,5,op1);
		
		System.out.println("===================================");
		
		TestBinaryOperator(2,5,op2);
		
	}
}
