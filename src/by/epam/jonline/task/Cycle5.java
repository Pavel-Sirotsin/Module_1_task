package by.epam.jonline.task;

import java.util.Scanner;

// Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, 
//модуль которых больше или равен заданному е. Общий член ряда имеет вид: An = 1/2^n + 1/3^n

public class Cycle5 {

	public static void main(String[] args) {
		double sum = 0;
		double e = in("e: >>");
		double member;

		for (int i = -10; i <= 2; i++) {

			member = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);

			if (Math.abs(member) >= e) {
				sum = sum + member;
				System.out.printf("n: %3d member: %-9.2f sum: %.2f \n", i, member, sum);
			}

		}

	}

	public static double in(String text) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.print(text);
		while (!in.hasNextDouble()) {

			System.out.println("Принимаються только целочисленные значения цифр:>>");
			in.next();
		}

		double x = in.nextDouble();

		return x;
	}

}