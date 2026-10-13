package FunctionalInterface;

import java.util.function.BiFunction;


public class BFI3 {
	
	public void TestBiFunction(int n,int m,BiFunction<Integer,Integer,String>op) {
		String res = op.apply(n,m);
		System.out.println(res);
	}
	
	public void main(String args[]) {
		
		BiFunction<Integer,Integer,String>op1 = (x,y)->"My roll number is "+x+" And my marks are "+y;
		
		
		
		
		
		
		System.out.println("===================================");
		
		TestBiFunction(22121036, 99, op1);
		
		
	}
}