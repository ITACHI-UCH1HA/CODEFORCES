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

            List<Integer> a = new ArrayList<>();
            a.add(b[0]);
            for (int i = 1; i < n; i++) {
                if (b[i-1] > b[i]) {
                    // insert something in between to satisfy rule
                    a.add(b[i-1]); // simplest choice
                }
                a.add(b[i]);
            }

            out.println(a.size());
            for (int num : a) out.print(num + " ");
            out.println();
        }

        out.flush();
    }
}

