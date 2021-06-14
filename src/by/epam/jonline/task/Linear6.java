package by.epam.jonline.task;

import java.util.Scanner;

//Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
//принадлежит закрашенной области, и false — в противном случае:

public class Linear6 {

	public static void main(String[] args) {
		int x, y;
		x = in("Введите координату x: ");
		y = in("Введите координату y: ");

		if ((x >= -4 & x <= 4 & y >= -3 & y <=0 ) || (x >= -2 & x <= 2 & y >=0 & y <=4)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

	public static int in(String massage) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println(massage);

		while (!in.hasNextInt()) {
			in.nextLine();
			System.out.println("Принимаються только целочисленные значения цифр");

		}

		int x = in.nextInt();
		return x;
	

	}

}