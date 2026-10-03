package Day2;

public class IntegerClass {

	public static void main(String[] args) {
		int a = 10;
		Integer b = a;//auto boxing
		int c = b.intValue();
		double d = b.doubleValue();
		byte e = b.byteValue();
		long l = b.longValue();
		
		System.out.println("Orignal value : "+a);
		System.out.println("Converted int : "+c);
		System.out.println("Double Value : "+d);
		System.out.println("Byte value : "+e);
		System.out.println("long value  : "+l);
		
		

	}

}

/*
 * 
 * 
 * 
Orignal value : 10
Converted int : 10
Double Value : 10.0
Byte value : 10
long value  : 10
 * 
 * 
 */