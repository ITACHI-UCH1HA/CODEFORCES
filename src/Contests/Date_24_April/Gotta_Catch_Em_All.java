package Contests.Date_24_April;

import java.util.Scanner;

public class Gotta_Catch_Em_All {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t > 0){
            int N= sc.nextInt();
            int X= sc.nextInt();
            int Y= sc.nextInt();

            int[] difficulty=new int[N];

            int sum=0;
            for (int i = 0; i < difficulty.length; i++) {
                difficulty[i]= sc.nextInt();
                if(difficulty[i]*X>Y){
                    sum+=Y;
                }else{
                    sum+=difficulty[i]*X;
                }
            }
            System.out.println(sum);
            t--;
        }
    }
}
