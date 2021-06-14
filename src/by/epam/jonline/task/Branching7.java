package by.epam.jonline.task;

import java.util.Scanner;

// Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
// m и n вводятся с клавиатуры.

public class Branching7 {

	public static void main(String[] args) {
		int m = in("Введите число m: ");
		int n = in("Введите число n: ");
		int denominator = 1;
		int number;

		for (int i = 0; i <= (n - m); i++) {

			number = m + i;

			int z;

			for (z = 2; z < number; z++) {

				denominator = number % z;
				if (denominator == 0) {
					System.out.print(z + " ");

				}
				if (denominator == 0) {
					System.out.println(":делитель для " + number);
				}
			}

		}
	}

	public static int in(String text) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.print(text);
		while (!in.hasNextInt()) {
			System.out.print("Допустимы только целые значения натуральных чисел! Повторите ввод:>>");
			in.next();
		}
		int x = in.nextInt();
		while (x < 0) {
			System.out.print("Допустимы только натуральные чисел от 0 ...! Повторите ввод:>>");
			x = in.nextInt();
		}
		return x;
	}
}