package Contests.Date_24_April;

import java.util.Scanner;

public class Petya_Strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        sc.close();

        System.out.println(FindAnswer(s1,s2));
    }

    private static int FindAnswer(String s1, String s2) {
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        for (int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i)==s2.charAt(i)) continue;
            if(s1.charAt(i)<s2.charAt(i)) return -1;
            if(s1.charAt(i)>s2.charAt(i)) return 1;
        }
        return 0;
    }
}
