package by.htp.hometask2darray.start;

/*—формировать квадратную матрицу пор€дка n по заданному образцу(n - четное)*/

public class Task15 {

	public static void main(String[] args) {

		int[][] arr;

		arr = initArray(6);

		printAll(arr);

	}

	private static int[][] initArray(int n) {

		int[][] arr = new int[n][n];

		int m = n;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				arr[i][j] = 0;

				if (j == i) {

					arr[i][j] = m;

					m--;
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
