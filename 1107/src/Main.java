// 리모컨(실패)

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int num= sc.nextInt();
		int[] btn = new int[num];
		for(int i =0 ; i<num; i++) {
			btn[i] = sc.nextInt();
		}
	}

	public static int channel(int N, int num, int[] btn) {
		String strN = Integer.toString(N);
		int result = strN.length();
		
		if(N == 100) return 0;
		else if(N == 99 || N == 101) return 1;
		else if(N == 98 || N == 102) return 2;
		
		for(int i=0; i<strN.length() ; i++) {
			int k = strN.indexOf(Integer.toString(btn[i]));
			if(k != -1) {
				
			}
		}
		
		
		return result;
	}
}
