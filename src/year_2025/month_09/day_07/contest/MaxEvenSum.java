package year_2025.month_09.day_07.contest;

//https://codeforces.com/contest/2137/problem/C

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;
import static java.lang.System.in;

public class MaxEvenSum {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        PrintWriter out = new PrintWriter(System.out);

        int t = parseInt(br.readLine());
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());

            long max = -1;

            // case 1: initial sum is even
            if ((a + b) % 2 == 0) {
                max = a + b;
            }

            // case 2: try powers-of-2 adjustment
            long bCopy = b;
            while (bCopy % 2 == 0) bCopy /= 2; // remove all powers of 2
            long k = b / bCopy; // largest power of 2 dividing b
            long newSum = a * k + b / k;
            if (newSum % 2 == 0) {
                max = Math.max(max, newSum);
            }

            out.println(max);
        }

        out.flush();
    }
}
