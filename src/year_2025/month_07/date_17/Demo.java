package year_2025.month_07.date_17;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt() - 1;

            int[] h = new int[n];
            int maxHeight = 0;
            for (int i = 0; i < n; i++) {
                h[i] = sc.nextInt();
                maxHeight = Math.max(maxHeight, h[i]);
            }

            int currentHeight = h[k];
            boolean canSurvive = false;

            for (int i = 0; i < n; i++) {
                if (h[i] != maxHeight) continue;

                if (currentHeight >= h[i]) {
                    canSurvive = true;
                    break;
                } else {
                    // check if 2 * currentHeight >= h[i] + 1
                    if (2L * currentHeight >= (long) h[i] + 1) {
                        canSurvive = true;
                        break;
                    }
                }
            }

            System.out.println(canSurvive ? "YES" : "NO");
        }
    }
}

