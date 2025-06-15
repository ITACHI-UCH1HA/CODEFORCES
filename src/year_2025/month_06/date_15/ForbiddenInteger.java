package year_2025.month_06.date_15;

import java.util.Scanner;

public class ForbiddenInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t > 0) {
			// inputs
			int n = sc.nextInt();
			int k = sc.nextInt();
			int x = sc.nextInt();

			// need to create a forbidden integer
			if(k==1 && x==1) {
				System.out.println("NO");
			}
			else if (x != 1 || (x!=2 && x!=3)) {
				System.out.println("YES");
				printThem(n, k, x);
			}else {
				System.out.println("NO");
			}

			t--;
		}
	}

	private static void printThem(int n, int k, int x) {
		int num = n;

		if (x != 1 && k != x) {
			int count = num / k;

			for (int i = 0; i < count; i++) {
				System.out.print(k + " ");
			}

			int rem = num % k;

			while (rem > 0) {
				System.out.print(1 + " ");
				rem--;
			}
		}
		else if(x!=1 && k==x) {
			int count = num / (k-1);

			for (int i = 0; i < count; i++) {
				System.out.print((k-1) + " ");
			}

			int rem = num % (k-1);

			while (rem > 0) {
				System.out.print(1 + " ");
				rem--;
			}
		}
		else {
			if(n%2==0) {
				int count = num/2;
				
				for(int i = 0 ; i< count ; i++) {
					System.out.print(2+" ");
				}
			}else {
				num = num-3;
				System.out.print(3+" ");
				
				int count = num/2;
				
				for(int i = 0 ; i< count ; i++) {
					System.out.print(2+" ");
				}
			}
		}
		System.out.println();
	}

}
