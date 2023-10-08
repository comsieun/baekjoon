// 최적화알고리즘 sort (실패)

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int[] A = new int[l];
		for (int i = 0; i < l; i++) {
			A[i] = sc.nextInt();
		}
		int s = sc.nextInt();
		int[] result = new int[l];
		result = F(A, s);
		for(int i =0;i<l;i++) System.out.print(result[i]+" ");

	}

	public static int[] F(int A[], int s) {
		int i = 1;
		while (s > 0) {
			if (A[i-1] < A[i]) {
				int tmp = A[i-1];
				A[i-1] = A[i];
				A[i] = tmp;
				s--;
				i = 0;
			}
			i++;
			if(A.length==i) return A;
		}
		return A;
	}
}
