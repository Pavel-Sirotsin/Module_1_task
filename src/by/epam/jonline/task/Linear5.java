package by.epam.jonline.task;


import java.text.SimpleDateFormat;


import java.util.Calendar;
import java.util.Scanner;

// Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
//данное значение длительности в часах, минутах и секундах в следующей форме:
//ННч ММмин SSc.

public class Linear5 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter T in  seconds: ");

		while (!sc.hasNextInt()) {
			sc.nextLine();
			System.out.print(" Wrong data! \n Enter T in  seconds and try again: ");

		}

		long t = sc.nextInt();

		if (t >= 86400) {
			System.out.println(" One day it's 24 hours :)! But... ");
			long h = t / 3600;
			long m = (t % 3600) / 60;
			long s = (t % 3600) - m * 60;

			System.out.println("Total time: " + h + "h:" + m + "m:" + s + "ss");

		} else {

			t = t * 1000 - 1000 * 60 * 60;
			SimpleDateFormat df = new SimpleDateFormat("HH'h' :mm'm' :ss's'");

			Calendar c = Calendar.getInstance();
			c.setTimeInMillis(t);
			c.get(Calendar.HOUR_OF_DAY);
			c.get(Calendar.MINUTE);
			c.get(Calendar.SECOND);

			System.out.println(df.format(c.getTime()));
		}

	}

}
