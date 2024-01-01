package Contests.Date_25_April;

import java.util.Scanner;

public class Radev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l= sc.nextInt();
        int b= sc.nextInt();
        int N= sc.nextInt();
        int sum=0;

        while(N>0){
            int L= sc.nextInt();
            int B= sc.nextInt();

            sum+=(L/l)*(B/b);
            N--;
            sc.nextLine();
        }

        System.out.println(sum);
        sc.close();
    }
}
