package year_2025.month_09.day_07.contest;

//https://codeforces.com/contest/2137/problem/C

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;
import static java.lang.System.in;

public class MaximumEvenSum {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        PrintWriter out = new PrintWriter(System.out);

        int t = parseInt(br.readLine());
        while (t-- > 0) {
            // your code here
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = parseInt(st.nextToken());
            int b = parseInt(st.nextToken());

            int max = -1;

            if((a+b)%2==0){
                max = Math.max(max, a+b);
            }

            if (b>1){
                int currMax = findMaxDivisor(a, b, -1);
                max = Math.max(currMax, max);
            }

            out.println(max);

        }

        out.flush();
    }

    private static int findDiv(int a, int b, int max){
        for (int i = 2; i < b; i++) {
            if(b%i==0){

            }
        }
        return max;
    }

    private static int findMaxDivisor(int a, int b, int max) {
        if(b<=1){
            return max;
        }

        for (int i = 2; i < b; i++) {
            if(b%i==0){
                a*= i;
                b/= i;
                if((a+b)%2==0){
                    max = Math.max(a+b, max);
                }
            }
            findMaxDivisor(a, b, max);
        }

        return max;
    }

}