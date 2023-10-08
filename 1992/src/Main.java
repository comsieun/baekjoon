import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		char[][] A = new char[size][size];
		for (int i = 0; i < size; i++) {
			String tmp = sc.next();
			A[i] = tmp.toCharArray();
		}
		// 넣는거 성공
		System.out.println(F(A, size, 0, 0));

	}

	public static String F(char[][] A, int size, int r, int c) {
		String one, two, three, four;
		if (size == 1)
			return Character.toString(A[r][c]);

		if (size > 2) {
			one = F(A, size / 2, r, c);
			two = F(A, size / 2, r, c + (size / 2));
			three = F(A, size / 2, r + (size / 2), c);
			four = F(A, size / 2, r + (size / 2), c + (size / 2));
			if (one.equals(two) && one.equals(three) && one.equals(four) && !one.contains("("))
				return one;
			return "(" + one + two + three + four + ")";
		} else {
			if (A[r][c] == A[r + 1][c] && A[r + 1][c] == A[r][c + 1] && A[r][c + 1] == A[r + 1][c + 1])
				return Character.toString(A[r][c]);
			else {
				String result = "(" + Character.toString(A[r][c]) + Character.toString(A[r][c + 1])
						+ Character.toString(A[r + 1][c]) + Character.toString(A[r + 1][c + 1]) + ")";
				return result;
			}
		}
	}
}