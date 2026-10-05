package Day4.P2;

import Day4.P1.A;

public class D extends A {

	public void main(String[] args) {
		System.out.println("Class D");
		//System.out.println("A " + a); //private cant be accessed
		System.out.println("B " + b);
		System.out.println("C " + c);
		//System.out.println("D " + d); //default cant be accessed outside packages
		//default values are package private members only

	}

}
