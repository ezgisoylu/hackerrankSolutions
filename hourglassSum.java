import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class hourglassSum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int[][] arr = new int[6][6];
		
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				//arr[i][j] = sc.nextInt();
				arr[i][j] = rd.nextInt(10);
			}
		}
		//Print array
		for (int[] x : arr){
		   for (int y : x){
		        System.out.print(y + " ");
		   }System.out.println();
		}
		
		System.out.println(hourglassSum(arr));
		
		
	}
	
	public static int hourglassSum(int[][] arr) {
		
		
		int max = 0;
		
		for (int i = 0; i < 4; i++) { //loop through the whole 2D array
			for (int j = 0; j < 4; j++) {
				int current = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] 
						+ arr[i+2][j+1] + arr[i+2][j+2];
				max = Math.max(current,max);
			}
		}
		return max;
	}

}
