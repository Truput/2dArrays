package by.htp.hometask2darray.start;

import java.util.Random;

/*� �������� ������� �������� ������� ��� ������� ����� �������, �. �. ��� �������� ������ ������� ��������� ��
��������������� �� ������� �������, � ��� �������� ������� ����������� � ������. ������ �������� ������
������������ � ����������.*/

import java.util.Scanner;

public class Task27 {

	public static void main(String[] args) {

		int[][] arr;
		int n;
		int m;
		int j1;
		int j2;

		System.out.print("������� ���������� �����: ");
		n = scannerInt();

		System.out.print("������� ���������� ��������: ");
		m = scannerInt();

		System.out.print("������� ����� ������� �������: ");
		j1 = scannerInt();

		System.out.print("������� ����� ������� �������: ");
		j2 = scannerInt();

		arr = initArray(n, m);

		printAll(arr);
		System.out.println();

		arr = changeArray(arr, j1, j2);
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

		Random rand = new Random();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				arr[i][j] = rand.nextInt(9);

			}
		}

		return arr;
	}

	private static int[][] changeArray(int[][] arr, int j1, int j2) {

		int temp;
		int temp1;

		for (int i = 0; i < arr.length; i++) {

			temp = arr[i][j1];

			temp1 = arr[i][j2];

			arr[i][j1] = temp1;

			arr[i][j2] = temp;
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
