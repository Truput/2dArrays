package by.htp.hometask2darray.start;

/*—формировать квадратную матрицу пор€дка n по заданному образцу(n - четное)*/

public class Task21 {

	public static void main(String[] args) {

		int[][] arr;

		arr = initArray(6);

		printAll(arr);

	}

	private static int[][] initArray(int n) {

		int[][] arr = new int[n][n];

		int aTemp = 1;
		int bTemp = 1;

		for (int i = arr.length - 1; i >= 0; i--) {
			for (int j = 0; j < arr[i].length; j++) {

				arr[i][j] = 0;

				if (j >= 0 && aTemp != n + 1) {

					arr[i][j] = aTemp;
					aTemp++;

				}
			}
			bTemp++;
			aTemp = bTemp;

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
