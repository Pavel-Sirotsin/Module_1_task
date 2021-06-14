package by.epam.jonline.task;

import java.util.Scanner;

// Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.

public class Branching1 {

	public static void main(String[] args) {
		int A, B, C;
		A = in("Введите угол  треугольника при стороне А: ");
		B = in("Введите угол  треугольника при стороне B: ");
		C = 180 - A - B;
		C = Math.abs(C);
		if (C == 90) {
			System.out.println("Треугольник существует и является прямоугольным.");
		} else if (C == 0)  {
			System.out.println("Треугольник не существует.");
		} else if (A + B + C == 180) {
			System.out.println("Треугольник существует.");
		} else {
			System.out.println("Треугольник не существует.");
		}
	}

	public static int in(String text) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println(text);
		while (!in.hasNextInt()) {
			System.out.println("Принимаються только целочисленные значения цифр:\n>>");
			in.nextLine();
		}
		int x = in.nextInt();
		return x;
	}
}
