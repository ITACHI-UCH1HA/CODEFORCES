package year_2025.month_06.date_20;

import java.util.*;

public class OneAndTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t= scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            int countTwo = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
                if (arr[i] == 2) {
                    countTwo++;
                }
            }

            if(countTwo%2==1){
                System.out.println(-1);
                continue;
            }

            countTwo/= 2; // Count pairs of twos

            for(int i=1; i<n;i++){

                if(arr[i-1]==2){
                    countTwo--;
                }

                if(countTwo==0){
                    System.out.println(i);
                    break;
                }

            }
        }
    }
}
