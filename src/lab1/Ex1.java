package lab1;

public class Ex1 {

	static int digitCube(int num) {
		int sum = 0, rem;

		while (num > 0) {
			rem = num % 10;
			sum += Math.pow(rem, 3);
			num /= 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(Ex1.digitCube(111));
	}

}
