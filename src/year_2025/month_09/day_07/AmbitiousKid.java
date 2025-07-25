package year_2025.month_09.day_07;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;
import static java.lang.System.in;

public class AmbitiousKid {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        PrintWriter out = new PrintWriter(System.out);

        int t = parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = Integer.MAX_VALUE;

        for (int i = 0; i < t; i++) {
            int num = parseInt(st.nextToken());
            count = Math.min(count, Math.abs(0-num));
        }

        out.println(count);


        out.flush();
    }
}
