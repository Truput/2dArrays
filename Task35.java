package by.htp.hometask2darray.start;

import java.util.Random;

/*Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.*/

public class Task35 {
	
	public static void main(String[] args) {
		
		int n = 5;
		int m = 5;
		int max;

		int[][] arr = new int[n][m];
		

		arr = initArray(arr);
		printAll(arr);
		System.out.println();
		
		max = findMaxInArray(arr);
		
		arr = changeArray(arr, max);
		printAll(arr);
		

	}

	public static int[][] initArray(int[][] arr) {

		Random rand = new Random();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = rand.nextInt(9);
			}
		}
		return arr;
	}
	
	public static int findMaxInArray(int[][] arr) {
		
		int max = arr[0][0];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				
				if (arr[i][j] > max) {
					
					max = arr[i][j];
				}
			}
		}
		return max;
	}
	
	public static int[][] changeArray(int[][] arr, int max) {
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				
				if (arr[i][j] % 2 != 0) {
					
					arr[i][j] = max;
				}
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
