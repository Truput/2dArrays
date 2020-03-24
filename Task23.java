package by.htp.hometask2darray.start;

/*Сформировать квадратную матрицу порядка N по правилу:







 −
=
N
J I
J I A
2 2
sin ] , [
и подсчитать количество положительных элементов в ней.*/

public class Task23 {

	public static void main(String[] args) {

		double[][] arr;

		arr = initArray(6);

		printAll(arr);

		System.out.println("Количество положительных элементов в массиве = " + quantityOfPositive(arr));

	}

	private static double[][] initArray(int n) {

		double[][] arr = new double[n][n];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				arr[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / n);

			}
		}

		return arr;
	}

	private static int quantityOfPositive(double[][] arr) {

		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				if (arr[i][j] > 0) {

					count++;

				}

			}
		}

		return count;
	}

	private static void printAll(double[][] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i][j] + "; ");

			}
			System.out.println();
		}

	}

}
