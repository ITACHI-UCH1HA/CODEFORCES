package year_2025.month_09.day_06;

//https://codeforces.com/problemset/problem/1877/A

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class GoalsOfVictory {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());

        while (t-->0){
            int n = Integer.parseInt(bf.readLine());

            StringTokenizer st = new StringTokenizer(bf.readLine());

            int sum = 0 ;
            for (int i = 0; i < n-1; i++) {
                sum += Integer.parseInt(st.nextToken());
            }
            System.out.println(-sum);
        }
    }
}
