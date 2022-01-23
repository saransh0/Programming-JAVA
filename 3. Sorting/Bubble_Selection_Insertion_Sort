package sample;

import java.util.*;

public class Sorting {

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
		
		bubble(arr);
		selection(arr);
		insertion(arr);
	}
	
	public static void bubble(int [] arr){
		
		for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++)
                if (arr[j] > arr[j+1]){
                	
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
		}
		
		System.out.println("Sorted array using bubble sort: ");
	
		for(int i=0; i<arr.length; i++) {
			
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("\n");
	}
	
	public static void selection(int [] arr){
		
		for (int i = 0; i < arr.length-1; i++) {
            
			int min_idx = i;
			
			for (int j = i+1; j < arr.length-i-1; j++) {
				
				if(arr[j]<arr[min_idx])
					min_idx = j;
			}
			
			int temp = arr[i];
			arr[i] = arr[min_idx];
			arr[min_idx] = temp;
		}
		
		System.out.println("Sorted array using Selection sort: ");
		
		for(int i=0; i<arr.length; i++) {
			
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("\n");
	}

	public static void insertion(int [] arr){
		
		for(int i=1; i<arr.length; i++) {
			
			for(int j = i-1; j>=0; j--) {
				
				if(arr[j]>arr[j+1]) {
					
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		System.out.println("Sorted array using Insertion sort: ");
		
		for(int i=0; i<arr.length; i++) {
			
			System.out.print(arr[i] + " ");
		}
	}
}
