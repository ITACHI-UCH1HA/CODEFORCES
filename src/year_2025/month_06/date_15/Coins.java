package year_2025.month_06.date_15;

import java.util.Scanner;

public class Coins {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while (t > 0) {
			//inputs
			long n = sc.nextLong();
			long k = sc.nextLong();
			
			
			// 2x + ky = n
			
			if(n%2==0 || n%k==0
				|| (n%2)%k==0 || (n%k)%2==0
				|| (n-k)%2==0 || (n-2)%k==0) {
				System.out.println("yes");
			}
			else {
				System.out.println("no");
			}
			
			t--;
		}
	}

}
