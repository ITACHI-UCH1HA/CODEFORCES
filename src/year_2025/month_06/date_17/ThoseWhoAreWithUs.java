package year_2025.month_06.date_17;

import java.util.*;

public class ThoseWhoAreWithUs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {
            //inputs
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[][] arr = new int[n][m];

            int[] rowSums = new int[n];
            int[] colSums = new int[m];

            for (int i = 0; i < n; i++) {
                int sum = 0;
                for (int j = 0; j < m; j++) {
                    arr[i][j] = sc.nextInt();
                    sum+= arr[i][j];
                }
                rowSums[i] = sum;
            }

            for (int i = 0; i < m; i++) {
                int sum = 0;
                for (int j = 0; j < n; j++) {
                    sum+= arr[j][i];
                }
                colSums[i] = sum;
            }

            int row = -1;
            int col = -1;

            int maxSum = Integer.MIN_VALUE;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    int sum = rowSums[i]+colSums[j]- arr[i][j];

                    if(sum>maxSum){
                        row = i;
                        col = j;

                        maxSum = sum;
                    }
                }
            }

            int maxMinValue = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if(i==row || j== col){
                        arr[i][j] = arr[i][j]-1;
                    }
                    maxMinValue = Math.max(maxMinValue, arr[i][j]);
                }
            }

            System.out.println(maxMinValue);
            t--;
        }
    }
}
