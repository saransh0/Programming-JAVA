package sample;
import java.util.*;

public class findmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		int [] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the target value");
		int target = sc.nextInt();
		
		linear(arr,target);
		binary(arr,target);
		
	}
	
	public static void linear(int[] arr, int target) {
		
		boolean ans = false;
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i] == target) {
				ans = true;
			}
		}
		
		System.out.println(ans);
	}
	
	public static void binary(int []arr, int target) {
		
		boolean ans = false;
		int low = 0;
		int high = arr.length-1;
		
		while(low<=high) {
			
			int mid = low + (high-low)/2; // so that overflow don't occur
			
			if(arr[mid] == target) {
				ans = true;
				break;
			}else if(target>arr[mid]) {
				low = mid + 1;
			}else {
				high = mid;
			}
		}
		
		System.out.println(ans);
	}

}
