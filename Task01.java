package by.htp.hometask2darray.start;

/*Cоздать матрицу 3 x 4, заполнить ее числами 0 и 1 так, чтобы в одной строке была ровно одна единица, и
вывести на экран.*/

public class Task01 {

	public static void main(String[] args) {

		int[][] arr;

		arr = initArray(3, 4);

		print(arr);

	}

	private static int[][] initArray(int n, int k) {

		int[][] arr = new int[n][k];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				arr[i][j] = 0;

				arr[i][2] = 1;

			}
		}

		return arr;
	}

	private static void print(int[][] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i][j] + "; ");

			}
			System.out.println();
		}

	}

}
