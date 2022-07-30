package organize;

public class MergeSortTest02 {

	public static int[] src;
	public static int[] tmp;

	public static void main(String[] args) {
		src = new int[] { 9, 1, 8, 5, 4, 7, 6, 3, 2 };
		tmp = new int[src.length];

	}

	public static void mergeSort(int start, int end) {

		if (start < end) {
			// 배열의 길이가 1 초과이면
			int mid = (start + end) / 2; // 몫으로 중간값을 구하고
			mergeSort(start, mid);
			mergeSort(mid + 1, end);// 배열을 반으로 자르고

			int p = start; // 처음지점
			int q = mid + 1; // 비교 시작 시점
			int idx = p;// 인덱스를 복사할때 좌표

			while (p <= mid || q <= end) {
				// 시작지점이 나뉜 두번째 블럭 전까지
				if (q > end || (p <= mid && src[p] < src[q])) {
					// q가 다 정렬이 끝났거나
					// 처음블럭 좌표가 마지막에 도달 안했고
					// q의 값이 더 크다면
					tmp[idx++] = src[p++];
					// 복사배열에 붙여넣고
					// idx와 시작 좌표를 한칸씩 옴긴다.
				} else {
					// q가 정렬이 안끝나고
					// 시작지점이 정렬이 끝낫거나 p가 더 크다면
					tmp[idx++] = src[q++];
					// q의 값을 대입한다.
				}
				for (int i = start; i <= end; i++) {
					src[i] = tmp[i];
					// 정렬한 배열을 다시 src에 대입한다.
				}
			} // if end

		}

	}
	//배열 출력
	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
