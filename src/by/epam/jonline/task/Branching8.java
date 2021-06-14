package by.epam.jonline.task;

//  Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.

public class Branching8 {

	public static void main(String[] args) {

		int n = 23456;

		while (n != 0) {

			int a = n % 10;

			int m = 47589;

			while (m != 0) {

				int b = m % 10;

				if (a == b) {
					System.out.print(b + " : ");
				}
				m /= 10;
			}

			n /= 10;
		}
		System.out.print(" dublicated numbers.");
	}

}
