package by.epam.jonline.task;

import java.util.Scanner;

// Напишите программу, где пользователь вводит любое целое положительное число. 
//А программа суммирует все числа от 1 до введенного пользователем числа.

public class Cycle1 {

	public static void main(String[] args) {
		int sum = 0;
		int N = in("Введите любое целое положительное число: ");
		for (int i = 0; i <= N; i++) {

			sum += i;

		}
		System.out.print("Сумма чисел = " + sum);

	}

	public static int in(String text) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.print(text);

		while (!in.hasNextInt()) {
			System.out.print("Принимаються только целочисленные значения чисел:>>");
			in.nextLine();
		}
		int x = in.nextInt();
		while (x < 0) {
			System.out.print("Принимаються только положительные значения чисел:>>");
			x = in.nextInt();
		}
		return x;
	}
}
