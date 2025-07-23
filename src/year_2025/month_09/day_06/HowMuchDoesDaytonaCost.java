package year_2025.month_09.day_06;

//https://codeforces.com/problemset/problem/1878/A

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class HowMuchDoesDaytonaCost {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());

        while (t-->0){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            Set<Integer> set = new HashSet<>();

            st = new StringTokenizer(bf.readLine());

            for (int i = 0; i < n; i++) {
                set.add(Integer.parseInt(st.nextToken()));
            }

            if(set.contains(k)){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
