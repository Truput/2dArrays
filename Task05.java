package by.htp.hometask2darray.start;

/*Дана матрица. Вывести на экран все четные строки, то есть с четными номерами.*/

import java.util.Random;

public class Task05 {

	public static void main(String[] args) {

		int[][] arr;

		arr = initArray(4, 5);

		printAll(arr);

		System.out.println();

		printResult(arr);

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

	private static void printResult(int[][] arr) {

		for (int i = 1; i < arr.length; i += 2) {
			for (int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i][j] + "; ");
			}

			System.out.println();
		}
	}

}
