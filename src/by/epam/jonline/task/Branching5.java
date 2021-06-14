package by.epam.jonline.task;

import java.util.Scanner;

//  Вычислить значение функции: f(x) =x2 -3x + 9, если x <=3; 1/x3 + 6, если x > 3


public class Branching5 {

	public static void main(String[] args) {

		int x;
		double f;

		x = in("Введите значение 'x': >> ");
		
		if (x <= 3) {
			 f = x * x - 3 * x + 9;
			 System.out.println(" f(x)= " + f);
		} else if (x > 3) {
			f = 1 / (Math.pow(x, 3) + 6);
			System.out.println(" f(x)= " + f);
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
