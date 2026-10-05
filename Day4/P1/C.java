package Day4.P1;

public class C {

	public void main(String[] args) {
		A obj = new A();
		System.out.println("Class C");
		//System.out.println("A " + obj.a);// a is a private member cant be accessed outside of class
		System.out.println("B " + obj.b); //protected member can access without inheriting it in same package
		//in c++ we cant access protected member outside class and its extended class;
		System.out.println("C " + obj.c);
		System.out.println("D " + obj.d);

	}

}
