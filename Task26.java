package by.htp.hometask2darray.start;

import java.util.Scanner;

/* � ���������� �������� ��������� ������ ����� ������������ n x m. ��������� � �������� ��������� ��������:
�) ��������� ����� ������������� ��������� � ������ ������;
�) ���������� ������������ ������� � ������ ������;
�) ����������� ������� ������������ � ����������� �������� �������.*/

public class Task26 {

	public static void main(String[] args) {

		int[][] arr;
		int n;
		int m;

		System.out.print("������� ���������� �����: ");
		n = scannerInt();

		System.out.print("������� ���������� ��������: ");
		m = scannerInt();

		arr = initArray(n, m);

		printAll(arr);
		System.out.println();

		calcSumOfNegative(arr);
		System.out.println();

		findMaxInString(arr);
		System.out.println();

		arr = changeArray(arr);
		printAll(arr);

	}

	private static int scannerInt() {

		@SuppressWarnings("resource")

		Scanner in = new Scanner(System.in);

		int number;

		while (!in.hasNextInt()) {
			in.next();
			System.out.println("������������ ����!");
			System.out.print("������� �����: ");
		}

		number = in.nextInt();

		return number;
	}

	private static int[][] initArray(int n, int m) {

		int[][] arr = new int[n][m];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				arr[i][j] = ((int) (Math.random() * 31) - 15);

			}
		}

		return arr;
	}

	private static void calcSumOfNegative(int[][] arr) {

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				if (arr[i][j] < 0) {

					sum += arr[i][j];
				}
			}

			System.out.println("����� ������������� ��������� � ������ " + i + " = " + sum);
			sum = 0;
		}
	}

	private static void findMaxInString(int[][] arr) {

		int max;

		for (int i = 0; i < arr.length; i++) {

			max = arr[i][0];

			for (int j = 0; j < arr[i].length; j++) {

				if (arr[i][j] > max) {

					max = arr[i][j];
				}
			}

			System.out.println("������������ ������� � ������ " + i + " = " + max);
		}
	}

	private static int[][] changeArray(int[][] arr) {

		int max = arr[0][0];
		int min = arr[0][0];
		int iMax = 1;
		int jMax = 1;
		int iMin = 1;
		int jMin = 1;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				if (arr[i][j] > max) {

					max = arr[i][j];
					iMax = i;
					jMax = j;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				if (arr[i][j] < min) {

					min = arr[i][j];
					iMin = i;
					jMin = j;
				}
			}
		}

		arr[iMin][jMin] = max;
		arr[iMax][jMax] = min;

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
