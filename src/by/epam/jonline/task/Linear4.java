package by.epam.jonline.task;

//Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами

// дробную и целую части числа и вывести полученное значение числа.

public class Linear4 {

	public static void main(String[] args) {

		double R = 123.456;
		int y = (int) R;

		R = R * 1000;
		int z = (int) R % 1000;
		z = z * 1000 + y;

		System.out.print("After changes : " + z);

	}

}
