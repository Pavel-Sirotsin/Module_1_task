package by.epam.jonline.task;

import java.util.Scanner;

//  Вычислить значения функции на отрезке [а,b] c шагом h: y = x,x>2; -x,x<=2;

public class Cycle2 {

	public static void main(String[] args) {
		int a, b, h;
		int f;

		a = in("Введите значение 'a': >>");
		b = in("Введите значение 'b': >>");
		h = in("Введите значение 'h': >>");

		for (int x = a; x < b; x += h) {

			if (x > 2) {
				f = x;
				System.out.println("При x: " + x + " f(x)= " + f);
			} else if (x <= 2) {
				f = -x;
				System.out.println("При x: " + x + " f(x)= " + f);
			}

		}

	}

	public static int in(String text) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.print(text);
		while (!in.hasNextInt()) {
			System.out.print("Принимаються только целочисленные значения цифр:>>");
			in.nextLine();
		}
		int x = in.nextInt();
		return x;
	}

}
