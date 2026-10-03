package Day2;

public class Integerclass2 {

	public static void main(String[] args) {
		int x = -10;
		int y = 10;
		//compareUnsigned(int x int y)
		
		int a = Integer.compareUnsigned(x,y); //values must be passed
		System.out.println(a); //1
		
		//compare
		
		int b = Integer.compare(x, y);
		System.out.println(b);
		
		//min max
		int c = Integer.max(10,30);
		System.out.println(c);
		
		int d = Integer.min(10,30);
		System.out.println(d);
		
		//stringtoint
		int e = Integer.parseInt("123");
		System.out.println(e+1);
		
		Integer.toBinaryString(10);//convert into binary values
		Integer.toHexString(10);//convert into hexadecimal value
		Integer.toOctalString(10);//convert to Octal String
		Integer.toString(10);//convert to String
				
		

	}

}
