package year_2025.month_06.date_14;

import java.util.Scanner;

public class JaggedSwaps {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while (t > 0) {
			//inputs
			int n = sc.nextInt();
			int[] arr = new int[n];
			
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			
//			// logic here 
//			
//			// if the first element is not 1 then its iimpossible to solve
//			
//			if(arr[0]!=1) {
//				System.out.println("no");
//				continue;
//			}
//			
//			boolean sorted = true;
//			
//
//			// if array is already sorted then no need to perform anything
//			
//			for (int i = 0; i < arr.length-1; i++) {
//				if(arr[i]>arr[i+1]) {
//					sorted = false;
//				}
//			}
//			
//			if(sorted) {
//				System.out.println("yes");
//				continue;
//			}
			
			if(arr[0]==1) {
				System.out.println("yes");
			}
			else {
				System.out.println("no");
			}
			
			t--;
		}
	}

}
