package year_2025.month_09.day_07;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import static java.lang.Integer.parseInt;
import static java.lang.System.in;

public class TargetPracticeOptimized {

    static int[][] score = {
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {1, 2, 2, 2, 2, 2, 2, 2, 2, 1},
            {1, 2, 3, 3, 3, 3, 3, 3, 2, 1},
            {1, 2, 3, 4, 4, 4, 4, 3, 2, 1},
            {1, 2, 3, 4, 5, 5, 4, 3, 2, 1},
            {1, 2, 3, 4, 5, 5, 4, 3, 2, 1},
            {1, 2, 3, 4, 4, 4, 4, 3, 2, 1},
            {1, 2, 3, 3, 3, 3, 3, 3, 2, 1},
            {1, 2, 2, 2, 2, 2, 2, 2, 2, 1},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
    };

//    static {
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//                int layer = Math.min(Math.min(i, 9-i), Math.min(j, 9-j));
//                score[i][j] = layer+1;
//            }
//        }
//    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        PrintWriter out = new PrintWriter(System.out);

        int t = parseInt(br.readLine());
        while (t-- > 0) {
            // your code here
            int sum = 0;

            for (int i = 0; i < 10; i++) {
                char[] row = br.readLine().toCharArray();
                for (int j = 0; j < 10; j++) {
                    if(row[j]=='X'){
                        sum += score[i][j];
                    }
                }
            }

            out.println(sum);

        }

        out.flush();
    }
}
