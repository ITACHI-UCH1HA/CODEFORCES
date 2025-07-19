package year_2025.month_07.date_22;

//https://codeforces.com/problemset/problem/1/A

import java.util.Scanner;

public class TheaterSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int m=sc.nextInt();
        int a=sc.nextInt();

        long row = 0 ;
        long col = 0 ;
        if(n%a==0){
            row+=n/a;
        }else{
            row+=(n/a)+1;
        }

        if(m%a==0){
            col+=m/a;
        }else{
            col+=(m/a)+1;
        }

        System.out.println(row*col);
    }
}
