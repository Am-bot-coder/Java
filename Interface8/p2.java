package Interface8;

//After Java 1.8
//Super Interface Clash
interface I3{
	default public void add() {
		System.out.println("I1 Calling");
	};
	
}
interface I4{
	default public void add() {
		System.out.println("I2 Calling");
	};
	
}

//ambiguty --->

public class p2 implements I3,I4 {
	public void add() {//Ambiguty Resolve By Shadowing the both methods
		System.out.println("Hello World");
	}
	
	public void main() {
		add();
	}

}


