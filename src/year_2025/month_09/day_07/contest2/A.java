package year_2025.month_09.day_07.contest2;

//https://codeforces.com/contest/2149/problem/A

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;
import static java.lang.System.in;

public class A {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        PrintWriter out = new PrintWriter(System.out);

        int t = parseInt(br.readLine());
        while (t-- > 0) {
            // your code here
            int n = parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int count = 0;
            int zeroes = 0;
            for (int i = 0; i < n; i++) {
                int num = parseInt(st.nextToken());
                if(num<0){
                    count++;
                }else if(num==0){
                    zeroes++;
                }
            }

            count = (count%2)*2 + zeroes;

            out.println(count);

        }

        out.flush();
    }
}
