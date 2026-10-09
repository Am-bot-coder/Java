package Array;

public class VariableArity {
	
	public int SumArr(int...x) {
		int sum  = 0;
		for(int i = 0;i<x.length;i++) {
			sum += x[i];
		}
		return sum;
	}

	public void main(String[] args) {
		int a [] = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Sum is :"+SumArr(a));//10
		
		System.out.println("Sum is "+SumArr(10,20,30,40,50,60,70,80,90,100)); //variable arity advantage
		

	}

}
/*
 * 
 * 
Sum is :55
Sum is 550

 */