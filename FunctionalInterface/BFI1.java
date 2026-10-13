package FunctionalInterface;

import java.util.function.Predicate;
//Predicate
public class BFI1 {
	
	public void TestPrdicate(int n,Predicate<Integer>op) {
		boolean r = op.test(n);
		if(r) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}
	
	public void main(String args[]) {
		
		
		Predicate<Integer>op1 = (x)->x%2==0;
		TestPrdicate(10, op1);
		TestPrdicate(11, op1);
		System.out.println("===================================");
		
		Predicate<Integer>op2 = (x)->x%2!=0;
		TestPrdicate(10, op2);
		TestPrdicate(11, op2);
		
		
	}
}
