package Interface8;
//before Java 1.8
interface I1{
	public void add();
	
}
interface I2{
	public void add();
	
}

public class p1 implements I1,I2 {
	public void add() {
		System.out.println("Hello World");
	}
	
	public void main() {
		add();
	}

}


//No ambiguty --->