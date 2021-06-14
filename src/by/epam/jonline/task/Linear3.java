package by.epam.jonline.task;

//Вычислить значение выражения по формуле (все переменные принимают действительные значения):((𝑠𝑖𝑛 𝑥 + 𝑐𝑜𝑠 𝑦)/(𝑐𝑜𝑠 𝑥 − 𝑠𝑖𝑛 𝑦))* 𝑡𝑔 𝑥y

public class Linear3 {

	public static void main(String[] args) {

		double x = 60;
		double y = 60;
		double f;

		x = Math.toRadians(x);
		y = Math.toRadians(y);
		f = Math.sin(x) + Math.cos(y);
		f = f / (Math.cos(x) - Math.sin(y));
		f = f * Math.tan(x * y);

		System.out.printf("Значение выражения = %.5f", f);

	}

}
