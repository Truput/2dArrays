package by.htp.hometask2darray.start;

import java.util.Random;

/*Дан линейный массив
n n
x x x x , , , ,
1 2 1 −
 . Получить действительную квадратную матрицу порядка n:*/

public class Task24 {

	public static void main(String[] args) {

		int[] arr;
		int[][] newarr;
		int n = 6;

		arr = initArray(n);

		newarr = initNewArray(arr, n);

		printAll(newarr);

	}

	private static int[] initArray(int n) {

		int[] arr = new int[n];

		Random rand = new Random();

		for (int i = 0; i < arr.length; i++) {

			arr[i] = rand.nextInt(9);

		}

		return arr;
	}

	private static int[][] initNewArray(int[] arr, int n) {

		int[][] newarr = new int[n][n];

		int temp = 0;
		int temp1 = 1;

		for (int i = 0; i < newarr.length; i++) {
			for (int j = 0; j < newarr[i].length; j++) {

				if (temp1 == i + 1) {

					newarr[i][j] = (int) Math.pow(arr[temp], temp1);
				}

				temp++;
			}
			temp1++;
			temp = 0;
		}

		return newarr;
	}

	private static void printAll(int[][] newarr) {

		for (int i = 0; i < newarr.length; i++) {
			for (int j = 0; j < newarr[i].length; j++) {

				System.out.print(newarr[i][j] + "; ");

			}
			System.out.println();
		}

	}

}
