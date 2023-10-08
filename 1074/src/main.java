// Z

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int r = sc.nextInt();
		int c = sc.nextInt();
		int size = (int) Math.pow(2, s);

		System.out.println(F(size, r, c));
	}

	public static int F(int s, int r, int c) {
		if (r == 0 && c == 0)
			return 0;
		else if (r == 0 && c == 1)
			return 1;
		else if (r == 1 && c == 0)
			return 2;
		else if (r == 1 && c == 1)
			return 3;
		else {
			if (r < s / 2 && c < s / 2)
				return F(s / 2, r, c);
			if (r < s / 2 && c >= s / 2)
				return (s * s / 4) + F(s / 2, r, c - (s / 2));
			if (r >= s / 2 && c < s / 2)
				return (s * s / 4) * 2 + F(s / 2, r - (s / 2), c);
			if (r >= s / 2 && c >= s / 2)
				return (s * s / 4) * 3 + F(s / 2, r - (s / 2), c - (s / 2));
		}
		return c;
	}
}
