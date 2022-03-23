package lab5.ex2;

import java.util.Scanner;

public class MainRunner2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First name and Last name --->");
		String first = sc.next();
		String last = sc.next();
		System.out.println("Fname--->" + first + "\n");
		System.out.println("Fname--->" + last + "\n");
		try {
			if (first == null || last == null) {
				throw new InvalidInputException2("Exception");
			}
			System.out.println("Fullname is= " + first + " " + last);
		} catch (InvalidInputException2 e) {
			System.out.println("Plz enter the name correctly");
		}
	}

}