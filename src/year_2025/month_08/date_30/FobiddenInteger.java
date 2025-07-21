package year_2025.month_08.date_30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//https://codeforces.com/problemset/problem/1845/A
public class FobiddenInteger {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());

        while (t-->0){
            StringTokenizer tk = new StringTokenizer(bf.readLine());
            int n = Integer.parseInt(tk.nextToken());
            int k = Integer.parseInt(tk.nextToken());
            int x = Integer.parseInt(tk.nextToken());

            if(k==1){
                System.out.println("NO");
            }
            else if(x!=1){
                System.out.println("YES");
                System.out.println(n);
                for (int i = 0; i < n; i++) {
                    if(i==n-1){
                        System.out.println(1);
                        break;
                    }
                    System.out.print(1+" ");
                }
            }
            else{
                if(n%2==0){
                    System.out.println("YES");
                    System.out.println(n/2);
                    for (int i = 0; i < n/2; i++) {
                        if(i==n-1){
                            System.out.println(2);
                            break;
                        }
                        System.out.print(2+" ");
                    }
                    System.out.println();
                }else if(k>=3){
                    System.out.println("YES");
                    System.out.println(n/2);
                    for (int i = 0; i < (n/2)-1; i++) {
                        System.out.print(2+" ");
                    }
                    System.out.println(3+" ");
                }else {
                    System.out.println("NO");
                }
            }
        }
    }
}
