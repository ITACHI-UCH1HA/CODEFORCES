package year_2025.month_09.day_07;

import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;
import static java.lang.System.in;

public class SequenceGame {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        PrintWriter out = new PrintWriter(System.out);

        int t = parseInt(br.readLine());
        while (t-- > 0) {
            int n = parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                b[i] = parseInt(st.nextToken());
            }


            out.println();
        }

        out.flush();
    }
}

