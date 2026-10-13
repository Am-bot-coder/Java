package Interface8;


//After Java 1.8
interface I5{
	default public void add() {
		System.out.println("I1 Calling");
	};
	
}
interface I6{
	default public void add() {
		System.out.println("I2 Calling");
	};
	
}

//ambiguty --->

public class P3 implements I5,I6 {
	public void add() {//Ambiguty Resolve By Shadowing the both methods
		System.out.println("Error Resolver");
		I5.super.add();
		I6.super.add();
	}
	
	public void main() {
		add();
	}

}



