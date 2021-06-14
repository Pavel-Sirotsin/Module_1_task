package by.epam.jonline.task;

import java.util.Scanner;

// Найти max{min(a, b), min(c, d)}.

public class Branching2 {

	public static void main(String[] args) {

		int a = enterFromConsole("Enter a: ");
		int b = enterFromConsole("Enter b: ");
		int c = enterFromConsole("Enter c: ");
		int d = enterFromConsole("Enter d: ");

		System.out.print(Math.max(Math.min(a, b), Math.min(c, d)));

	}

	public static int enterFromConsole(String message) {

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.print(message);
		while (!in.hasNextInt()) {
			System.out.print("Try again: ");
			in.hasNext();
		}
		return in.nextInt();

	}

}
