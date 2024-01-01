package Year_2023.Month_10.Date_16;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        sc.nextLine();

        while (t > 0) {
            int n= sc.nextInt();
            int a=1,b=0,c=0;
            for (int i = 1; i*i < n; i++) {
                int[] ans=twopointerserch(n-a,a+1);
            }
            t--;
        }
    }

    private static int[] twopointerserch(int n,int start) {
        int l=1;
        return new int[]{};
    }
}
