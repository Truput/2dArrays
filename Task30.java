package by.htp.hometask2darray.start;

/*ћатрицу 10x20 заполнить случайными числами от 0 до 15. ¬ывести на экран саму матрицу и номера строк, в
которых число 5 встречаетс€ три и более раз.*/

public class Task30 {

	public static void main(String[] args) {

		int[][] arr;

		arr = initArray(10, 20);

		printAll(arr);

		System.out.println();

		printResult(arr);

	}

	private static int[][] initArray(int n, int m) {

		int[][] arr = new int[n][m];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				arr[i][j] = (int) (Math.random() * 16);
			}
		}

		return arr;
	}

	private static void printResult(int[][] arr) {

		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				if (arr[i][j] == 5) {

					count++;
				}
			}
			if (count >= 3) {

				System.out.println("„исло 5 встречаетс€ три и более раз в строке " + (i + 1));
			}
			count = 0;
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
