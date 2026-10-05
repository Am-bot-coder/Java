package Array;

public class RaggedArray1 {
	public static void main(String[] args) {
		int[][] rarr = new int[5][];
		rarr[0] = new int[] {1,2,3,4,5};
		rarr[1] = new int[] {1,2,3,4};
		rarr[2] = new int[] {1,2,3};
		rarr[3] = new int[] {1,2};
		rarr[4] = new int[] {1};	
		
		
		for(int i = 0;i<rarr.length;i++) {
			for(int j=0; j<rarr[i].length;j++) {
				System.out.print(rarr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	
}
