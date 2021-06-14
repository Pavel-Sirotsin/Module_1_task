package by.epam.jonline.task;

import java.math.BigInteger;

//  Составить программу нахождения произведения квадратов первых двухсот чисел

public class Cycle4 {

	public static void main(String[] args) {
		BigInteger result = new BigInteger("1");

		for (int i = 1; i < 200; i++) {
			
			int power = i*i;
			result = result.multiply(BigInteger.valueOf(power));

		}
		System.out.print(result);

	}

}
