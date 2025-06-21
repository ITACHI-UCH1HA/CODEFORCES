package year_2025.month_07.date_01;

//https://codeforces.com/contest/2123/problem/C

import java.util.*;

public class PrefixMinAndSuffixMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();

            int arr[] = new int[n];

            String s = "";

            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                min = Math.min(min, arr[i]);
                max = Math.max(max, arr[i]);
            }

            for (int i = 0; i < n; i++) {
                if(i==0 || i==n-1 || arr[i]==min || arr[i]==max){
                    s+="1";
                }else{
                    s+="0";
                }
            }

            System.out.println(s);
        }
    }
}
