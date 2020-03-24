package by.htp.hometask2darray.start;

import java.util.Random;
import java.util.Scanner;

/*Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой столбец
содержит максимальную сумму.*/

public class Task28 {

	public static void main(String[] args) {

		int[][] arr;
		int n;
		int m;
		int maxInd;

		System.out.print("Введите количество строк: ");
		n = scannerInt();

		System.out.print("Введите количество столбцов: ");
		m = scannerInt();

		arr = initArray(n, m);

		printAll(arr);
		System.out.println();

		maxInd = result(arr, m);

		printMaxInd(maxInd);

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

	private static int result(int[][] arr, int m) {

		int maxSum = calcSumOfElements(arr, 0);

		int maxInd = 0;

		int sum = 0;

		for (int j = 0; j <= m - 1; j++) {

			sum = calcSumOfElements(arr, j);
			System.out.println("Сумма элементов в " + j + " столбце = " + sum);

			if (sum > maxSum) {

				maxSum = sum;

				maxInd = j;
			}
		}

		return maxInd;
	}

	private static int calcSumOfElements(int[][] arr, int j) {

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {

			sum += arr[i][j];

		}

		return sum;
	}

	private static void printAll(int[][] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i][j] + "; ");

			}
			System.out.println();
		}

	}

	private static void printMaxInd(int maxInd) {

		System.out.println("Столбец " + maxInd + " содержит максимальную сумму элементов");
	}

}
