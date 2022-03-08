package lab1;

public class Ex7 {
	static boolean checkNumber(int n) {
		while (n > 10) {
			if (n % 10 < (n / 10) % 10) {
				return false;
			}
			n /= 10;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(Ex7.checkNumber(134468));
	}

}
