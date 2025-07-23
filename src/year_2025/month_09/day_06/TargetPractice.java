package year_2025.month_09.day_06;

//https://codeforces.com/problemset/problem/1873/C

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import static java.lang.Integer.parseInt;
import static java.lang.System.in;

public class TargetPractice {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        PrintWriter out = new PrintWriter(System.out);

        int t = parseInt(br.readLine());
        while (t-- > 0) {
            // your code here
            char[][] matrix = new char[10][10];
            for (int i = 0; i < 10; i++) {
                matrix[i]= br.readLine().toCharArray();
            }
            int sum = 0;

            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if(matrix[i][j]=='X'){
                        int layer = Math.min(Math.min(i, 9-i), Math.min(j, 9-j));
                        sum += layer+1;
                    }
                }
            }

            out.println(sum);
        }

        out.flush();
    }
}
