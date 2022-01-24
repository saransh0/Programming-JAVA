package sample;

import java.util.Scanner;

public class MergeSort {

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
		
		int [] ans = new int[n]; 
		ans = mergeSort(arr,0,arr.length-1); 
		
		System.out.println("Sorted array using merge sort: ");
		
		for(int i=0; i<arr.length; i++) {
			
			System.out.print(ans[i] + " ");
		}
	
	}
	
	
	public static int[] mergeSort(int [] arr, int low, int high) {
		
		if(low>=high) {
			
			int [] ba = new int[1];
			ba[0] = arr[low];
			return ba;
		}
		
		int mid = (high + low)/2;
		
		int [] fsh = mergeSort(arr,low,mid); // first sorted half
		int [] ssh = mergeSort(arr,mid+1,high); // second sorted half
		
		int [] fsa = merge(fsh,ssh); // fully sorted array
		
		return fsa;
		
	}
	
	
	public static int[] merge(int [] fsh, int [] ssh) {
		
		int i=0,j=0,k=0;
		int [] ans = new int[fsh.length + ssh.length];
		
		while(i<fsh.length && j<ssh.length) {
			
			if(fsh[i] > ssh[j]) {
				
				ans[k] = ssh[j];
				k++;
				j++;
			}else {
				
				ans[k] = fsh[i];
				k++;
				i++;
			}
		}
		
		while(i<fsh.length) {
			
			ans[k] = fsh[i];
			i++;
			k++;
		}
		
		while(j<ssh.length) {
			
			ans[k] = ssh[j];
			j++;
			k++;
		}
		
		
		return ans;
	}

}
