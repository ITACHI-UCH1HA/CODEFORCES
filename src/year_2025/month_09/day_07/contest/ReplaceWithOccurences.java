package year_2025.month_09.day_07.contest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;
import static java.lang.System.in;

public class ReplaceWithOccurences {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        PrintWriter out = new PrintWriter(System.out);

        int t = parseInt(br.readLine());
        while (t-- > 0) {
            // your code here
            int n = parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] nums = new int[n];
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                nums[i] = parseInt(st.nextToken());
                map.put(nums[i], map.getOrDefault(nums[i],0)+1);
            }
            boolean flag = false;
            int frequencies = 0;
            for (int num : map.keySet()) {
                int freq = map.get(num);
                frequencies += freq;
                if(freq%num!=0 || frequencies>n){
                    flag = true;
                    break;
                }
            }

            if(flag){
                out.println(-1);
            }else {

            }

        }

        out.flush();
    }
}
