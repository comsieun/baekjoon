import java.util.Scanner;

//시간초과된 방식
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Long min = sc.nextLong();
		Long max = sc.nextLong();

		int result = (int) (max - min) + 1;
		
		Long s = (long) (Math.sqrt(max));
		for (Long j = min; j <= max; j++) {
			if (j % 4 == 0 || j % 9 == 0 || j % 25 == 0 || j % 49 == 0 || j % 121 == 0 || j % 169 == 0 || j%289==0) {
				result--;
			} else {
				for (Long i = (long) 19; ((i * i) <= j) && (i <= s) || i % 3 != 0|| i % 5 != 0|| i % 7 != 0|| i % 11 != 0|| i % 13 != 0|| i % 17 != 0; i += 2) {
					if (j % (i * i) == 0) {
						result--;
						break;
					}
				}
			}
		}
		System.out.println(result);
	}
}