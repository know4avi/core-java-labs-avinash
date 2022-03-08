package lab1;

import java.util.*;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter:- \n1 for red light\n2 for yellow light\n3 for green light");
		int in = sc.nextInt();

		switch (in) {
		case 1:
			System.out.println("stop");
			break;
		case 2:
			System.out.println("ready");
			break;
		case 3:
			System.out.println("go");
			break;

		default:
			System.out.println("Invalid Choice");

		}
	}

}
