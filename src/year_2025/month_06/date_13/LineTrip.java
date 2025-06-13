package year_2025.month_06.date_13;

import java.util.*;

public class LineTrip {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while (t > 0) {
			//inputs
			int n = sc.nextInt();
			int x = sc.nextInt();

			int[] arr = new int[n];

			for (int i = 0; i < n; i++) {

				arr[i] = sc.nextInt();

			}
			
			int max = Math.max( 0 , arr[0]);
			
			//logic here
			int val = arr[0];
			
			for(int i=1 ; i<n; i++) {
				int dist = arr[i]-val;
				
				max = Math.max(dist, max);
				
				val= arr[i];
			}
			
			max = Math.max(max, (x-val)*2);
			
			//output
			System.out.println(max);
			t--;
		}
	}

}
