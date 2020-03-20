package by.htp.hometask2darray.start;

/*ѕолучить квадратную матрицу пор€дка n:*/

public class Task12 {

	public static void main(String[] args) {

		int[][] arr;

		arr = initArray(5);

		printAll(arr);

	}

	private static int[][] initArray(int n) {

		int[][] arr = new int[n][n];

		int m = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				arr[i][j] = 0;

				if (i == j) {

					if (i != arr.length - 1 && j != arr[i].length - 1) {

						arr[i][j] = m;
						m++;
					} else {

						arr[i][j] = n - 1;
					}
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
