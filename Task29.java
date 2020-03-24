package by.htp.hometask2darray.start;

/*Найти положительные элементы главной диагонали квадратной матрицы.*/

public class Task29 {

	public static void main(String[] args) {

		int[][] arr;

		arr = initArray(4);

		printAll(arr);

		System.out.println();

		printResult(arr, 4);

	}

	private static int[][] initArray(int n) {

		int[][] arr = new int[n][n];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				arr[i][j] = ((int) (Math.random() * 31) - 15);
			}
		}

		return arr;
	}

	private static void printResult(int[][] arr, int n) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				if (i == j) {

					if (arr[i][j] > 0) {

						System.out.println("Положительный элемент " + arr[i][j] + " находится в " + (i + 1)
								+ " строке в " + (j + 1) + " столбце");
					}
				}
			}
		}

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
