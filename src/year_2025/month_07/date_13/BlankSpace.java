package year_2025.month_07.date_13;

import java.util.Scanner;

public class BlankSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }

            int max = 0;
            int count = 0;
            for (int i = 0; i < n; i++) {
                if(nums[i]==0){
                    count++;
                }else{
                    max = Math.max(max, count);
                    count = 0;
                }
            }

            max = Math.max(max, count);
            System.out.println(max);
        }
    }
}
