package year_2025.month_07.date_01;

//https://codeforces.com/contest/2123/problem/B

import java.util.*;

public class Tournament {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();

            int[] arr = new int[n];

            int minStrength = Integer.MAX_VALUE;
            int maxStrength = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                maxStrength = Math.max(maxStrength,arr[i]);
                minStrength = Math.min(minStrength, arr[i]);
            }

            if(maxStrength==minStrength || arr[j-1]==maxStrength || k>1){
                System.out.println("YES");
                continue;
            }else{
                System.out.println("NO");
            }
        }
    }
}
