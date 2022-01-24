package sample;

import java.util.Scanner;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		
		int [] arr = new int[n];
		
		System.out.println("Enter the elements to sort");
		
		for(int i=0; i<n; i++) {
			
			arr[i] = sc.nextInt();
		}
		
		quickSort(arr,0,arr.length-1); 
		
		System.out.println("Sorted array using Quick sort: ");
		
		for(int i=0; i<arr.length; i++) {
			
			System.out.print(arr[i] + " ");
		}
	}

	
	public static void quickSort(int [] arr, int low, int high) {
		
		if(low>=high)
			return;
		
		int pivot = arr[high];
		int pivot_index = partition(arr,pivot,low,high);
		quickSort(arr,low,pivot_index-1);
		quickSort(arr,pivot_index,high);
	}
	
	
	public static int partition(int [] arr, int pivot, int low, int high) {
		
		int i=low,j=low;
		
		while(i<=high) {
			
			if(arr[i]>pivot) {
				
				i++;
			}else {
			
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
				i++;
			}
		}
		
		return (j-1); // returning pivot index
		
		
	}
}
