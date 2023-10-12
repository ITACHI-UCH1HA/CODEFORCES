package Contests.Date_12_october;

import java.util.Scanner;

public class Dont_Try_Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume the newline after t
        while (t > 0) {
            int n = sc.nextInt(); // Length of x
            int m = sc.nextInt(); // Length of s
            sc.nextLine(); // Consume the newline
            String x = sc.nextLine().trim();
            String s = sc.nextLine().trim();
            System.out.println(checking(x, s, n, m));
            t--;
        }
        sc.close();
    }

    private static int checking(String x, String s, int n, int m) {
        if (x.contains(s)) {
            return 0;
        }
        int result=0;
        while (x.length() < m) {
            x += x;
            result++;
        }
        if(x.contains(s)){
            return result;
        }else{
            x+=x;
            if(x.contains(s)){
                return result+1;
            }
        }
        return -1;
    }
}

