package by.htp.hometask2darray.start;

/*—формировать квадратную матрицу пор€дка n по заданному образцу(n - четное)*/

public class Task20 {

	public static void main(String[] args) {

		int[][] arr;

		arr = initArray(6);

		printAll(arr);

	}

	private static int[][] initArray(int n) {

		int[][] arr = new int[n][n];

		int arrEnd = n - 2;
		int arrBeg = 1;

		for (int i = 0; i <= (n / 2) - 1; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				arr[i][j] = 1;

				if (j >= arrBeg && j <= arrEnd) {

					arr[i][j] = 0;

				}
			}
			arrBeg++;
			arrEnd--;
		}
		
		arrBeg--;
		arrEnd++;

		for (int i = n / 2; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				arr[i][j] = 1;

				if (j >= arrBeg && j <= arrEnd) {

					arr[i][j] = 0;
				}
			}
			arrBeg--;
			arrEnd++;
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
