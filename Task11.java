package by.htp.hometask2darray.start;

import java.util.Random;

/*Дана матрица размера m x n. Вывести ее элементы в следующем порядке: первая строка справа налево, вторая
строка слева направо, третья строка справа налево и так далее.*/

public class Task11 {

	public static void main(String[] args) {

		int[][] arr;
		int c;

		arr = initArray(5, 5);

		printAll(arr);

		System.out.println();

		c = lengthOfSecondArray(arr);

		printResult(arr, c);

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

	private static int lengthOfSecondArray(int[][] arr) {

		int c = 1;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				c = arr[i].length - 1;

			}
		}

		return c;

	}

	private static void printResult(int[][] arr, int c) {

		int m;

		int t;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				

				if (i % 2 == 0) {
					
					if (j <= arr[i].length) {

					m = arr[i][j];

					t = arr[i][c];

					arr[i][j] = t;

					c--;

					System.out.print(arr[i][j] + "; ");
					}else {
					System.out.print(arr[i][j] + "; ");
					}
					
				} else {

					System.out.print(arr[i][j] + "; ");
				}
			}
			c = arr[i].length - 1;

			System.out.println();
		}
	}
}
