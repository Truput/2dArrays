package by.htp.hometask2darray.start;

import java.util.Random;

/*Найдите произведение двух матриц.*/

public class Task39 {

	public static void main(String[] args) {
		int m1 = 3;
		int n1 = 2;

		int m2 = n1;
		int n2 = 2;

		int[][] arr1 = new int[m1][n1];

		initArrayVal(arr1);
		printArray(arr1);
		System.out.println();

		int[][] arr2 = new int[m2][n2];

		initArrayVal(arr2);
		printArray(arr2);
		System.out.println();

		int[][] res = new int[m1][n2];

		for (int i = 0; i < m1; i++) {
			for (int j = 0; j < n2; j++) {
				for (int k = 0; k < m2; k++) {
					res[i][j] += arr1[i][k] * arr2[k][j];
				}
			}
		}

		printArray(res);

	}

	public static void printArray(int[][] arr) {

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i][j] + " ");
			}
			System.out.println("");
		}
	}

	public static int[][] initArrayVal(int[][] arr) {

		Random ran = new Random();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = ran.nextInt(10);
			}
		}
		return arr;
	}

}
