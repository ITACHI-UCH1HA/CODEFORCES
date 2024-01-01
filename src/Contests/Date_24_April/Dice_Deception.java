package Contests.Date_24_April;

import java.util.Arrays;
import java.util.Scanner;

public class Dice_Deception {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        while(t>0){
            int N= sc.nextInt();
            int K= sc.nextInt();

            int[] rolls= new int[N];
            int sum=0;
            for (int i = 0; i < N; i++) {
                rolls[i]= sc.nextInt();
            }
            Arrays.sort(rolls);
            for (int i = 0; i < N; i++) {
                if(K>0 && rolls[i]<4){
                    sum+=7-rolls[i];
                    K--;
                }else{
                    sum+=rolls[i];
                }
            }

            System.out.println(sum);
            t--;
        }
    }
}
