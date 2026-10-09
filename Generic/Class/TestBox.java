package Generic.Class;

public class TestBox {

	public static void main(String[] args) {
		Box<Number>b1;
		b1 = new Box<Number>();
		b1.SetV(new Integer(100));
		b1.SetV(new Double(100.3256));
		
		//System.out.println(b1.getV());
		
		Box2<Double>b2;
		b2= new Box2<Double>();
		
		b2.SetV(new Double(10.23));
		//System.out.println(b2.getV());
		
		
		
		

	}

}

