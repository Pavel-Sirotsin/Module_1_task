package by.epam.jonline.task;

import java.util.Scanner;

// Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через отверстие.

public class Branching4 {

	public static void main(String[] args) {
		int a, b, x, y, z;

		a = in("Введите высоту отверстия: >>");
		b = in("Введите ширину отверстия: >>");
		x = in("Введите высоту кирпича: >>");
		y = in("Введите ширину кирпича: >> >>");
		z = in("Введите длинну кирпича >>");

		if (a > x & b > y & b < z & a < y) {
			System.out.println("Кирпичь пройдет через отверстие только по ширине и высоте.");
		} else if (a > y & b > z) {

			System.out.println("Кирпичь пройдет через отверстие  в любом случае.");
		}else {
			System.out.println("Кирпичь не пройдет через отверстие.");
		}
	}

	public static int in(String text) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println(text);
		while (!in.hasNextInt()) {
			System.out.println("Принимаються только целочисленные значения цифр:>>");
			in.nextLine();
		}
		int x = in.nextInt();
		return x;
	}

}
