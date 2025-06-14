package year_2025.month_06.date_14;

import java.util.Scanner;

public class GameWithIntegers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while (t > 0) {
			//inputs
			int n = sc.nextInt();
			
			if((n+1)%3==0 || (n-1)%3==0) {
				System.out.println("First");
			}else {
				System.out.println("Second");
			}
			t--;
		}
	}

}
