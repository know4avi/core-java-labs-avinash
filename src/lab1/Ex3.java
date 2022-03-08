package lab1;

public class Ex3 {
	static int fibRec(int n) {
		if (n <= 1)
			return n;
		return fibRec(n - 1) + fibRec(n - 2);
	}

	static int fibNonRec(int n) {
		int a = 0, b = 1, c;
		if (n == 0)
			return a;
		for (int i = 2; i <= n; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return b;
	}

	public static void main(String[] args) {
		System.out.println(Ex3.fibRec(10));
		System.out.println(Ex3.fibNonRec(10));
	}

}
