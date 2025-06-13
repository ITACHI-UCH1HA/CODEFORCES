package year_2025.month_06.date_13;

import java.util.*;

public class HalloumiBoxes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

//		while (t > 0) {
//
//			int n = sc.nextInt();
//			int k = sc.nextInt();
//
//			int[] arr = new int[n];
//
//			for (int i = 0; i < n; i++) {
//
//				arr[i] = sc.nextInt();
//
//			}
//			boolean order = true;
//			for (int i = 0; i < n - 1; i++) {
//
//				if (!(arr[i] <= arr[i + 1])) {
//					if (k < 2) {
//						System.out.println("NO");
//						order = false;
//						break;
//					} else {
//						System.out.println("YES");
//						order = false;
//						break;
//					}
//				}
//
//			}
//
//			if (order) {
//				System.out.println("YES");
//			}
//
//			t--;
//
//		}
		while (t > 0) {

			int n = sc.nextInt();
			int k = sc.nextInt();

			int[] arr = new int[n];

			for (int i = 0; i < n; i++) {

				arr[i] = sc.nextInt();

			}
			
			int[] copy = Arrays.copyOf(arr,arr.length);
			
			Arrays.sort(arr);
			
			if(Arrays.equals(arr, copy) || k>2) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
			t--;

		}
	}

}
