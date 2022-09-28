package VariableArguments;

public class VariableArguments {

	public static void main(String[] args) {

		System.out.println(plus(1, 2, 3));
	}

	public static int plus(int... sayilar) {

		int sum = 0;

		for (int sayi : sayilar) {
			sum += sayi;
		}

		return sum;
	}
}
