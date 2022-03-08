package lab1;

public class Ex6 {
	static int calculateDifference(int n) {
		int sum = 0, sqsum = 0;

		for (int i = 1; i <= n; i++) {
			sum += i;
			sqsum += i * i;
		}

		return (sqsum - (sum * sum));

	}
	
	public static void main(String[] args) {
		System.out.println(Ex6.calculateDifference(10));
	}
}
