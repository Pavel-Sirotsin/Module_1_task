package by.epam.jonline.task;

import java.util.Scanner;

//Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.


public class Branching3 {

	public static void main(String[] args) {

		int x = in("Введите абсцису точки 'A': >>");
		int y = in("Введите ординату точки'A': >>");
		int x1 = in("Введите абсцису точки 'B': >>");
		int y1 = in("Введите ординату точки 'B': >>");
		int x2 = in("Введите абсцису точки 'С': >>");
		int y2 = in("Введите ординату точки 'С': >>");

		if ((y - y1) / (y2 - y1) == (x - x1) / (x2 - x1)) {
			System.out.println("Точки лежат на одной прямой. ");
		} else {
			System.out.println("Точки не лежат на одной прямой. ");
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