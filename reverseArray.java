import java.util.Arrays;
import java.util.Scanner;

public class reverseArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array: ");
		int l = sc.nextInt();
		
		int[] arr = new int[l];
		System.out.println("Enter the elements");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Inputs are: " + Arrays.toString(arr));
		
		for (int i = 0; i < arr.length/2; i++) { //half will be changed automatically
			int temp = arr[i];
			arr[i] = arr[l-i-1];
			arr[l-i-1] = temp;
		}
		System.out.println("Reverse of the array is: " + Arrays.toString(arr));

	}

}
