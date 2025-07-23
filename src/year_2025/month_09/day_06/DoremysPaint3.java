package year_2025.month_09.day_06;

//https://codeforces.com/problemset/problem/1890/A

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class DoremysPaint3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());

        while (t-->0){
            int n = Integer.parseInt(bf.readLine());
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int[] arr = new int[n];
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
                map.put(arr[i], map.getOrDefault(arr[i],0)+1);
            }
            if(n==2){
                System.out.println("YES");
                continue;
            }
            //case where the unique elements is one
            if(map.size()==1){
                System.out.println("YES");
                continue;
            }

            //case where the unique elements is three
            if(map.size()>=3){
                System.out.println("NO");
                continue;
            }

            //case where there are two unique elements
            List<Integer> list = new ArrayList<>(map.values());
            int first = list.get(0);
            int second = list.get(1);
            if(first==second || Math.abs(first-second)==1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
