package by.htp.hometask2darray.start;

import java.util.Random;

/*Создать и вывести на экран матрицу 2 x 3, заполненную случайными числами из [0, 9].*/

public class Task02 {

	public static void main(String[] args) {

		int[][] arr;

		arr = initArray(2, 3);

		print(arr);

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

	private static void print(int[][] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i][j] + "; ");

			}
			System.out.println();
		}

	}

}
