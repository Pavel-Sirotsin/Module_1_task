package by.epam.jonline.task;

// Вычислить значение выражения по формуле (все переменные принимают действительные значения):(𝑏 + √(𝑏2 + 4𝑎𝑐))/2𝑎  − 𝑎3𝑐 + 𝑏−2

public class Linear2 {

	public static void main(String[] args) {
		int a = 5;
		int b = 3;
		int c = 9;
		double f;

		f = Math.pow(b, 2) + 4 * a * c;
		f = b + Math.sqrt(f);
		f = f / 2 * a;
		f = f - Math.pow(a, 3) * c;
		f = f + Math.pow(b, -2);

		System.out.printf("Значение выражениия = %.2f", f);

	}

}
