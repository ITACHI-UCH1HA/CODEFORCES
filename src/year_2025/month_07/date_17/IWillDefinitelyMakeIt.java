package year_2025.month_07.date_17;

//https://codeforces.com/contest/2126
//https://codeforces.com/contest/2126/problem/C

import java.util.*;

public class IWillDefinitelyMakeIt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();

            int nums[] = new int[n];

            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }

            int pos = nums[k-1];

            Arrays.sort(nums);
            int i= 0;

            while(i<n && nums[i]<pos){
                i++;
            }

            int waterLevel = 1;
            for (; i < n-1; i++) {
                if((i+1)<n && nums[i+1]==pos){
                    continue;
                }
                if(i==n-1){
                    continue;
                }
                int diff = nums[i+1]- nums[i];
                int currLevel = waterLevel+diff;
                int waterDiff = nums[i]-waterLevel;
                if(waterDiff+1<diff){
                    break;
                }else{
                    waterLevel= currLevel;
                }
            }

            if(i==n-1){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
//1
//        5 3
//        3 2 1 4 5
