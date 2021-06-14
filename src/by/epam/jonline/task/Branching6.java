package by.epam.jonline.task;

//  Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.

public class Branching6 {

	public static void main(String[] args) {
		for (byte i = 32; i < 127; i++) {
			byte number = i;

			while (number != 0) {
				int result = number % 2;
				number /= 2;

				System.out.print(result);
			}

			System.out.println(" - binery | Symbol - " + (char) i);

		}
	}

}
