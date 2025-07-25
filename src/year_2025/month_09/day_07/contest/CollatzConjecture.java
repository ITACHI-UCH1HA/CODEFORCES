package year_2025.month_09.day_07.contest;

//https://codeforces.com/contest/2137/problem/A

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;
import static java.lang.System.in;

public class CollatzConjecture {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        PrintWriter out = new PrintWriter(System.out);

        int t = parseInt(br.readLine());
        while (t-- > 0) {
            // your code here
            StringTokenizer st = new StringTokenizer(br.readLine());
            int k = parseInt(st.nextToken());
            int x = parseInt(st.nextToken());

            while(k-->0){
                x*=2;
            }

            out.println(x);

        }
        out.flush();
    }
}
