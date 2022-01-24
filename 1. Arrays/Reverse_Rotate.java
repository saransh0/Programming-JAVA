package sample;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		int [] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			
			arr[i] = sc.nextInt();
		}
		
		
		System.out.println("Enter the K factor by which you want to rotate");
		int k = sc.nextInt();
		
		reverse(arr); // reversing the array
		
		System.out.println("Rerevse array: ");
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
		System.out.println();
		
		rotate_right(arr,k); // rotate array by K distance towards right
		rotate_left(arr,k); // rotate array by K distance towards left
		
		
	}
	
	public static void reverse(int [] arr) {
		
		int left = 0;
		int right = arr.length-1;
		
		while(left<right) {
			
			int temp = arr[right];
			arr[right] = arr[left];
			arr[left] = temp;
			left++;
			right--;
			
		}
	}
	
	
	public static void rotate_right(int [] arr, int k) {
		
		int loop = (k%arr.length);
		
		for(int i=0; i<loop; i++) {
			
			int last = arr[arr.length-1];
			for(int j = arr.length-1; j>0; j--) {
				
				arr[j] = arr[j-1];
			}
			
			arr[0] = last;
		}
		
		System.out.println("Array rotate by K distance towards right");
		
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void rotate_left(int [] arr, int k) {
		
		int loop = (k%arr.length);
		
		for(int i=0; i<loop; i++) {
			
			int first = arr[0];
			for(int j = 0; j<arr.length-1; j++) {
				
				arr[j] = arr[j+1];
			}
			
			arr[arr.length-1] = first;
		}
		
		System.out.println("Array rotate by K distance towards left");
		
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
		
	
}
