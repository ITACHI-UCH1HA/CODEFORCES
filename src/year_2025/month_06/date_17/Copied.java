package year_2025.month_06.date_17;

import java.util.*;

public class Copied{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int m=sc.nextInt();
            int n=sc.nextInt();
            int mat[][]=new int[m][n];
            int max=0;
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    mat[i][j]=sc.nextInt();
                    max=Math.max(max,mat[i][j]);
                }
            }

            int total=0;
            int rf[]=new int[m];
            int cf[]=new int[n];
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(mat[i][j]==max){
                        total++;
                        rf[i]++;
                        cf[j]++;
                    }
                }
            }

            int ans=max;
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(mat[i][j]==max){
                        if(rf[i]+cf[j]==total+1){
                            ans=max-1;
                            break;
                        }
                    }
                    else if(rf[i]+cf[j]==total){
                        ans=max-1;
                        break;
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
