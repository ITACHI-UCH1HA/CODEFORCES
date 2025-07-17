package year_2025.month_07.date_17;

//https://codeforces.com/contest/2126/problem/D


import java.util.Scanner;

public class ThisIstheLastTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            int x = sc.nextInt();

            int[][] nums = new int[n][3];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 3; j++) {
                    nums[i][j]= sc.nextInt();
                }
            }


        }

    }
}
