package year_2025.month_06.date_13;

import java.util.*;

public class CoverInWater {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while (t > 0) {
			//inputs
			int n = sc.nextInt();
			sc.nextLine();
			String s = sc.nextLine();

			char[] arr = s.toCharArray();
			
			int op = 0;
			
//			for (int i = 0; i < n-1; i++) {
//				if(arr[i]=='.') {
//					op++;
//				}
//				if(arr[i+1]=='.') {
//					op++;
//					while(i<n && arr[i]!='#') {
//						i++;
//					}
//					if(i<n) {
//						
//					}
//				}
//			}
			
//			logic
			int count = 0;
			for (int i=0; i<n ; i++) {
				if(arr[i]=='.' && count<2) {
					op++;
					count++;
				}
				
				if(count==2) {
					break;
				}
				
				if(arr[i]=='#') {
					count=0;
				}
				
			}
			
			//output
			System.out.println(op);
			t--;
		}
		sc.close();
	}
}
