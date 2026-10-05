package Array;

public class ArrayExceptions {

	public static void main(String[] args) {
		int [] arr1 = new int[-2];
		int [] arr2 = new int[] {10,20,30,40,50,60};
		int [] arr3 = {20,30};
		
		
		System.out.println(arr1[2]); //java.lang.NegativeArraySizeException
		System.out.println(arr2[2]);
		//System.out.println(arr3[2]); //java.lang.ArrayIndexOutOfBoundsException
		
		System.out.println(arr2);//[I@2b2fa4f7
	}

}
