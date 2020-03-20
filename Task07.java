package by.htp.hometask2darray.start;

import java.util.Scanner;

/*Дан двухмерный массив 5×5. Найти сумму модулей отрицательных нечетных элементов.*/

public class Task07 {

	public static void main(String[] args) {

		int[][] arr;
		int sum;

		arr = initArray(5, 5);

		printAll(arr);

		System.out.println();

		sum = sum(arr);

		print(sum);

	}

	private static int scannerInt() {

		@SuppressWarnings("resource")

		Scanner in = new Scanner(System.in);

		int number;

		while (!in.hasNextInt()) {
			in.next();
			System.out.println("Некорректный ввод!");
			System.out.print("Введите число: ");
		}

		number = in.nextInt();

		return number;
	}

	private static int[][] initArray(int n, int k) {

		int[][] arr = new int[n][k];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				System.out.print("Введите элемент матрицы в " + i + " строке " + j + " столбце: ");
				arr[i][j] = scannerInt();
			}
		}

		return arr;
	}

	private static void printAll(int[][] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i][j] + "; ");

			}
			System.out.println();
		}

	}

	private static int sum(int[][] arr) {

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				if (arr[i][j] < 0 && arr[i][j] % 2 != 0) {

					sum = sum + Math.abs(arr[i][j]);
				}

			}
		}

		return sum;
	}

	private static void print(int sum) {

		System.out.println("Сумма таковых элементов = " + sum);

	}

}
