package year_2025.month_07.date_22;

//https://codeforces.com/contest/2125/problem/0

import java.util.Scanner;

public class DifficultContest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();

        while(t-->0){
            String s = sc.nextLine();
            char[] ch = s.toCharArray();

            for(int i=0; i<s.length()-2; i++){
               // String check = new Scanner(ch, i, 3);
            }

            String ans = new String(ch);

            System.out.println(ans);
        }

    }
    public static void swap(char[] ch, int i, int j){
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
    }
}
