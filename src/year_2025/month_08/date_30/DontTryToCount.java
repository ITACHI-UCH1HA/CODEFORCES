package year_2025.month_08.date_30;

//https://codeforces.com/problemset/problem/1881/A

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//fjdgmujlcontfjdgmujlcontfjdgmujlcontfjdgmujlcont

public class DontTryToCount {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());

        while (t-->0){
            StringTokenizer tk = new StringTokenizer(bf.readLine());
            int n = Integer.parseInt(tk.nextToken());
            int m = Integer.parseInt(tk.nextToken());
            String x = bf.readLine();
            String s = bf.readLine();

            System.out.println(checking(n,m,x,s));
        }
    }
    public static int checking(int n, int m, String x, String s){
        int count = 0;
        while(!x.contains(s) && (x.length()<=25)){
            x +=x;
            count++;
        }
        if(x.contains(s)){
            return count;
        }
        return -1;
//        int count = 0;
//
//        // Keep doubling until length >= |s|
//        while (x.length() < s.length()) {
//            x = x + x;
//            count++;
//            if (x.contains(s)) return count;
//        }
//
//        // Try a couple more times in case of overlaps
//        for (int i = 0; i < 2; i++) {
//            if (x.contains(s)) return count;
//            x = x + x;
//            count++;
//        }
//
//        return x.contains(s) ? count : -1;
    }
}
