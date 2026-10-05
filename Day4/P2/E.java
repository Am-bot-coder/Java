package Day4.P2;

import Day4.P1.A;

public class E {
	A obj = new A();
	public void main(String[] args) {
		System.out.println("Class E");
		//System.out.println("A " + obj.a);//private cant be accessed
		//System.out.println("B " + obj.b);//protected cant be accessed outside package without inheriting
		System.out.println("C " + obj.c);  
		//System.out.println("D " + obj.d);//default cant be accessed outside package

	}

}
