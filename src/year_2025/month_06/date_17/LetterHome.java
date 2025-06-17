package year_2025.month_06.date_17;

import java.util.Scanner;

public class LetterHome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {
            //inputs
            int n = sc.nextInt();
            int s = sc.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            if(arr[0]==s || arr[n-1]==s){
                System.out.println(arr[n-1]-arr[0]);
            }
            else if(s>arr[n-1]){
                System.out.println(s-arr[0]);
            }
            else if(s<arr[0]){
                System.out.println(arr[n-1]-s);
            }
            else {

                int min = Math.min((arr[n-1]-s)*2+(s-arr[0]), (arr[n-1]-s)+2*(s-arr[0]));

                System.out.println(min);
            }

            t--;
        }
    }
}
