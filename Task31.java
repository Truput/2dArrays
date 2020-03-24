package by.htp.hometask2darray.start;

import java.util.Random;

/*Сформировать матрицу из чисел от 0 до 999, вывести ее на экран. Посчитать количество двузначных чисел в ней.*/

public class Task31 {

	public static void main(String[] args) {

		int[][] arr;
		int quant;

		arr = initArray(10, 10);

		printAll(arr);

		System.out.println();

		quant = quantityOf2Digit(arr);

		printResult(quant);

	}

	private static int[][] initArray(int n, int m) {

		int[][] arr = new int[n][m];

		Random rand = new Random();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				arr[i][j] = rand.nextInt(999);
			}
		}

		return arr;
	}

	private static int numberOfDigit(int number) {

		int count = 0;

		while (!(number < 1)) {

			number = number / 10;
			count++;
		}

		return count;
	}

	private static int quantityOf2Digit(int[][] arr) {

		int quant = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				if (numberOfDigit(arr[i][j]) == 2) {

					quant++;
				}
			}
		}

		return quant;
	}

	private static void printAll(int[][] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i][j] + "; ");

			}
			System.out.println();
		}

	}

	private static void printResult(int quant) {

		System.out.println("Количество двухзначных чисел в матрице = " + quant);

	}

}
