package year_2025.month_09.day_07.contest;

//https://codeforces.com/contest/2137/problem/B

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;
import static java.lang.System.in;

public class FunPermutation {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        PrintWriter out = new PrintWriter(System.out);

        int t = parseInt(br.readLine());
        while (t-- > 0) {
            // your code here
            int n = parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sum = n+1;
            for (int i = 0; i < n; i++) {
                out.print(sum-parseInt(st.nextToken())+" ");
            }
            out.println();
        }

        out.flush();
    }
}
