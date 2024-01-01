package Contests.Date_24_April;

import java.util.Scanner;

public class K_Closeness {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();

            int[] values = new int[N];
            int max = Integer.MIN_VALUE;

            for (int i = 0; i < N; i++) {
                values[i] = sc.nextInt();
                max = Math.max(max, values[i]);
            }

            long min = Long.MAX_VALUE; // Using long to handle potential overflow
            long newMax = Integer.MIN_VALUE; // Using long to handle potential overflow

            for (int i = 0; i < N; i++) {
                int diff = max - values[i];
                if (diff > K) {
                    int div=diff/K;

//                    if (diff % K == 0) {
//                        div = diff / K;
//                    } else {
//                        div = (diff / K) + 1;
//                    }

                    int val1=values[i]+(K*div);
                    int val2=values[i]+(K*(div+1));

                    if(diff%K==0){
                        values[i]+=K*(div);
                    }
                    else if((max-val1)>(max-val2)){
                        values[i]=val2;
                    }else{
                        values[i]=val1;
                    }
//                    values[i] += K * div;
                } else if (diff == K) {
                    values[i] += K;
                }

                newMax = Math.max(newMax, values[i]);
                min = Math.min(min, values[i]);
            }

            System.out.println(newMax - min);

            t--;
        }
        sc.close();
    }
}
