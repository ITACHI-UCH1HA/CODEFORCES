package year_2025.month_07.date_10;

import java.util.Scanner;

//https://codeforces.com/contest/2131/problem/A

public class Lever {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            int[] arr1= new int[n];
            int[] arr2 = new int[n];

            int count = 0;

            for (int i = 0; i < n; i++) {
                arr1[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                arr2[i] = sc.nextInt();
                if(arr2[i]<arr1[i]){
                    count+= arr1[i]-arr2[i];
                }
            }

            System.out.println(count+1);
        }

    }
}
