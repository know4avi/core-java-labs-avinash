package lab3;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {

		System.out.println(" Enter the Date here (YYYY/MM/DD Format Allowed) ----->");
		Scanner sc = new Scanner(System.in);

		int year = sc.nextInt();
		int month = sc.nextInt();
		int date = sc.nextInt();

		LocalDate givendate = LocalDate.of(year, month, date);
		LocalDate presentdate = LocalDate.now();
		sc.close();

		Period diff = Period.between(givendate, presentdate);

		System.out.printf("Difference is" + " " + diff.getYears() + " years" + " " + diff.getMonths() + " months " + " "
				+ diff.getDays() + "days" + " ");

	}

}
