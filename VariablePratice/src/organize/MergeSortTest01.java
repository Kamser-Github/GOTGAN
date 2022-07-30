package organize;

public class MergeSortTest01 {
	
	public static int[] src;
	public static int[] tmp;

	public static void main(String[] args) {
		src = new int[] { 9, 1, 8, 5, 4, 7, 6, 3, 2 };
		tmp = new int[src.length];
		printArray(src);
		System.out.println("--------------");
		mergeSort(0, src.length - 1);
		System.out.println("--------------");
		printArray(src);
	}

	public static void mergeSort(int start, int end) {

		if (start < end) {
			int mid = (start + end) / 2;
			mergeSort(start, mid);
			mergeSort(mid + 1, end);
			
			int p = start;
			int q = mid + 1;
			int idx = p;

			while (p<=mid || q<=end) {
				if ( q>end || ( p<=mid && src[p]<src[q]) ) {
					tmp[idx++] = src[p++];
				} else {
					tmp[idx++] = src[q++];
				}
			}

			for (int i = start; i <= end; i++) {
				src[i] = tmp[i];
			}
			for(int a : tmp) {
				System.out.print(a+" ");
			}
			System.out.println();
		}//if end
	}

	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}
}
