package by.htp.hometask2darray.start;

import java.util.Random;
import java.util.Scanner;

/*Найдите сумму двух матриц*/

public class Task38 {

	public static void main(String[] args) {

		int[][] arr;
		int[][] newarr;
		int[][] sumarr;
		int n;
		int m;

		System.out.print("Введите количество строк: ");
		n = scannerInt();

		System.out.print("Введите количество столбцов: ");
		m = scannerInt();

		arr = initArray(n, m);
		printAll(arr);
		System.out.println();

		newarr = initNewArray(n, m);
		printAll(newarr);
		System.out.println();

		sumarr = sumOfArrays(n, m, arr, newarr);
		printAll(sumarr);

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

	private static int[][] initNewArray(int n, int m) {

		int[][] newarr = new int[n][m];

		Random rand = new Random();

		for (int i = 0; i < newarr.length; i++) {
			for (int j = 0; j < newarr[i].length; j++) {

				newarr[i][j] = rand.nextInt(9);

			}
		}

		return newarr;
	}

	private static int[][] sumOfArrays(int n, int m, int[][] arr, int[][] newarr) {

		int[][] sumarr = new int[n][m];

		for (int i = 0; i < newarr.length; i++) {
			for (int j = 0; j < newarr[i].length; j++) {

				sumarr[i][j] = arr[i][j] + newarr[i][j];

			}
		}

		return sumarr;
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
