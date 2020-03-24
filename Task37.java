package by.htp.hometask2darray.start;

import java.util.Random;
import java.util.Scanner;

/*Переставить строки матрицы случайным образом.*/

public class Task37 {

	public static void main(String[] args) {

		int[][] arr;
		int n;
		int m;

		System.out.print("Введите количество строк: ");
		n = scannerInt();

		System.out.print("Введите количество столбцов: ");
		m = scannerInt();

		arr = initArray(n, m);

		printAll(arr);
		System.out.println();

		arr = changeArray(arr);
		printAll(arr);

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

	private static int[][] changeArray(int[][] arr) {

		Random rand = new Random();

		int temp;
		int temp1;
		int iRandom;

		for (int i = 0; i < arr.length; i++) {

			iRandom = rand.nextInt(arr.length - 1);
			for (int j = 0; j < arr[i].length; j++) {

				temp = arr[i][j];

				temp1 = arr[iRandom][j];

				arr[i][j] = temp1;

				arr[iRandom][j] = temp;
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
