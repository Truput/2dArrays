package by.htp.hometask2darray.start;

import java.util.Random;

/*—формировать случайную матрицу m x n, состо€щую из нулей и единиц, причем в каждом столбце число
единиц равно номеру столбца.*/

public class Task34 {
	
	public static void main(String[] args) {
		
		Random rand = new Random();

		int[][] arr = new int [rand.nextInt(9)][rand.nextInt(9)];

		arr = initArray(arr);

		printAll(arr);

	}

	private static int[][] initArray(int[][] arr) {
		
		int t = 1;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				if (j < t) {

					arr[i][j] = 0;
				}else {
					
					arr[i][j] = 1;
				}
			}
			t++;
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
