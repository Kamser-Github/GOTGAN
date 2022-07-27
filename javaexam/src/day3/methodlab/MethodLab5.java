package day3.methodlab;

public class MethodLab5 {
	
	public static int[] powerArray(int num) {
		int[] numArr = new int[10];
		for(int i=0; i<numArr.length ; i++) {
			numArr[i] = (i+1)*num;
		}
		return numArr;
	}
	
	public static void main(String[] args) {
		
		int[][] arr = {
				powerArray(2),
				powerArray(3),
				powerArray(4)
		};
		
		for(int i=0; i<arr.length ; i++) {
			for(int j=0; j<arr[i].length ; j++) {
				System.out.print(arr[i][j]);
				if(j<arr[i].length-1)
					System.out.print(",");
			}
			System.out.println();
		}
	}
	
}
