package lab1;

import java.util.*;

public class Ex4 {

	static boolean isPrime(int n) {

		boolean isP = true;

		for (int i = 2, limit = n / 2; i <= limit; i++) {
			if (n % i == 0) {
				isP = false;
				break;
			}
		}

		return isP;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			if (Ex4.isPrime(i)) {
				System.out.println(i);
			}
		}

	}

}
