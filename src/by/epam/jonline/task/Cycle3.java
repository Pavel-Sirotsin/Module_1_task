package by.epam.jonline.task;

// Найти сумму квадратов первых ста чисел.

public class Cycle3 {

	public static void main(String[] args) {

		int sum = 0;
		int n = 1;

		for (int i = 0; i < 100; i++) {

			n = i * i;
			sum += n;

		}
		System.out.print("Сумма квадратов = " + sum);

	}

}
