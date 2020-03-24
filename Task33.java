package by.htp.hometask2darray.start;

import java.util.Random;

/*Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.*/

public class Task33 {
	
public static void main(String[] args) {
		
		int[][] arr = new int[5][6];
		
		initArrayVal(arr);
		
		printArray(arr);
		System.out.println();
		
		arr = sortIncrease(arr);
         
        printArray(arr);
        System.out.println();
        
        arr = sortDecrease(arr);
        printArray(arr);
		
		}
	
	public static int[][] initArrayVal(int[][] arr) {

		Random ran = new Random();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = ran.nextInt(10);
			}
		}
		return arr;
	}

	public static void printArray(int[][] arr) {

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i][j] + " ");
			}
			System.out.println("");
		}
	}
	
	public static int[][] sortIncrease(int[][] arr){
		
		for(int i = 0; i < arr.length; i++) {
        	for(int j = arr.length - 1; j > 0; j--) {
        		for(int t = 0; t < j; t++) {
        			if(arr[t][i] > arr[t + 1][i]) {
        				int temp = arr[t][i];
        				arr[t][i] = arr[t + 1][i];
        				arr[t + 1][i] = temp;
        			}
        		}
        	}
        	
        }
		
		return arr;
	}
	
	public static int[][] sortDecrease(int[][] arr){
		
		for(int i = 0; i < arr.length; i++) {
        	for(int j = arr.length - 1; j > 0; j--) {
        		for(int t = 0; t < j; t++) {
        			if(arr[t][i] < arr[t + 1][i]) {
        				int temp = arr[t][i];
        				arr[t][i] = arr[t + 1][i];
        				arr[t + 1][i] = temp;
        			}
        		}
        	}
        	
        }
		
		return arr;
	}

}
