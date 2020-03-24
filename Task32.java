package by.htp.hometask2darray.start;

import java.util.Random;

/*Отсортировать строки матрицы по возрастанию и убыванию значений элементов.*/

public class Task32 {

	public static void main(String[] args) {

		int[][] arr;

		arr = initArray(3, 3);

		printAll(arr);
		System.out.println();

		arr = sortIncrease(arr);

		printAll(arr);
		System.out.println();

		arr = sortDecrease(arr);
		printAll(arr);

	}

	private static int[][] initArray(int n, int m) {

		int[][] arr = new int[n][m];

		Random rand = new Random();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				arr[i][j] = rand.nextInt(9);
			}
		}

		return arr;
	}

	private static int[][] sortIncrease(int[][] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = arr[i].length - 1; j > 0; j--) {
				for (int t = 0; t < j; t++) {

					if (arr[i][t] > arr[i][t + 1]) {
						int tmp = arr[i][t];
						arr[i][t] = arr[i][t + 1];
						arr[i][t + 1] = tmp;
					}
				}
			}
		}

		return arr;
	}

	private static int[][] sortDecrease(int[][] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = arr[i].length - 1; j > 0; j--) {
				for (int t = 0; t < j; t++) {

					if (arr[i][t] < arr[i][t + 1]) {
						int tmp = arr[i][t];
						arr[i][t] = arr[i][t + 1];
						arr[i][t + 1] = tmp;
					}
				}
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

}
