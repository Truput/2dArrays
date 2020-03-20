package by.htp.hometask2darray.start;

import java.util.Random;

/*Дана матрица. Вывести k-ю строку и p-й столбец матрицы.*/

public class Task10 {

	public static void main(String[] args) {

		int[][] arr;

		arr = initArray(5, 5);

		printAll(arr);

		System.out.println();

		printLine(arr, 3);

		System.out.println();

		printColumn(arr, 4);

	}

	private static int[][] initArray(int n, int k) {

		Random rand = new Random();

		int[][] arr = new int[n][k];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				arr[i][j] = rand.nextInt(9);
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

	private static void printLine(int[][] arr, int k) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				if (i == k) {

					System.out.print(arr[i][j] + "; ");
				}
			}
			if (i == k) {

				System.out.println();
			}
		}

	}

	private static void printColumn(int[][] arr, int p) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				if (j == p) {

					System.out.println(arr[i][j] + "; ");
				}
			}
		}

	}

}
