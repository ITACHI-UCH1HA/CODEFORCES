package year_2025.month_07.date_17;

//https://codeforces.com/contest/2126/problem/0

import java.util.*;

public class OnlyOneDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();

            if(n<10){
                System.out.println(n);
                continue;
            }

            int min = Integer.MAX_VALUE;

            while(n>0){
                int rem = n%10;
                min = Math.min(rem, min);
                n/=10;
            }

            System.out.println(min);
        }
    }
}
