package Interface8;

//Super Clash Wins

class I7{
	public void add() {
		System.out.println("I7 Calling");
	};
	
}
interface I8{
	default public void add() {
		System.out.println("I8 Calling");
	};
	
}

//ambiguty --->

public class p4 extends I7 implements I8 {

	
	public void main() {
		add(); // Class get Priority
	}

}



