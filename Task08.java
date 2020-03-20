package by.htp.hometask2darray.start;

import java.util.Random;

/*Дан двухмерный массив n×m элементов. Определить, сколько раз встречается число 7 среди элементов
массива.*/

public class Task08 {

	public static void main(String[] args) {

		int[][] arr;
		int count;

		arr = initArray(5, 5);

		printAll(arr);

		System.out.println();

		count = count(arr);

		print(count);

	}

	private static int[][] initArray(int n, int m) {

		Random rand = new Random();

		int[][] arr = new int[n][m];

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

	private static int count(int[][] arr) {

		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				if (arr[i][j] == 7) {

					count++;
				}

			}
		}

		return count;
	}

	private static void print(int count) {

		System.out.println("Число 7 в матрице встречается " + count + " раз");

	}
}
