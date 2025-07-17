package year_2025.month_07.date_17;

//https://codeforces.com/contest/2126/problem/B

import java.util.*;

public class NoCasinoInMountains {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] days = new int[n];
            int peaks = 0;
            int counter = k;
            for (int i = 0; i < n; i++) {
                days[i] = sc.nextInt();

            }

            for (int i = 0; i < n; i++) {
                if(days[i]==0 && counter>0){
                    counter--;
                }
                if(counter==0){
                    i++;
                    counter=k;
                    peaks++;
                }
                if(i<n && days[i]==1){
                    counter=k;
                }
            }
            System.out.println(peaks);
        }
    }
}
