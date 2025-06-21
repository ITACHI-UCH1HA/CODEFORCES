package year_2025.month_07.date_01;

//https://codeforces.com/contest/2123/problem/A

import java.util.*;

public class BlackboardGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();

            if(n%4==0){
                System.out.println("Bob");
            }else{
                System.out.println("Alice");
            }
        }
    }
}
