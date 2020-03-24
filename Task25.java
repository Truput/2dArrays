package by.htp.hometask2darray.start;

/*ѕолучить квадратную матрицу пор€дка n:*/

public class Task25 {

	public static void main(String[] args) {

		int[][] arr;

		arr = initArray(4);

		printAll(arr);

	}

	private static int[][] initArray(int n) {

		int[][] arr = new int[n][n];

		int temp = 1;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				arr[i][j] = temp;
				temp++;

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
