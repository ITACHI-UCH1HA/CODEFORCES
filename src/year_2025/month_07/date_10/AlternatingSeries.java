package year_2025.month_07.date_10;

//https://codeforces.com/contest/2131/problem/B

import java.util.Scanner;

public class AlternatingSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();

            int count = (n/2) +1;

            boolean neg = true;

            while(n-->0){
                if(neg){
                    System.out.print(-1+" ");
                    neg =false;
                }else{
                    System.out.print(count);
                    count = count-1;
                }
            }
        }

    }
}
