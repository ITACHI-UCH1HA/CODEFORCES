package Contests.Date_22_october;

import java.util.HashMap;
import java.util.Scanner;

public class Chemistry {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t>0){
            int n= sc.nextInt();
            int k= sc.nextInt();
            sc.nextLine();
            String s= sc.nextLine();
            if(isChemistry(s,n,k)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            t--;
        }
    }
    public static boolean isChemistry(String s,int n,int k){
        HashMap<Character,Integer> map=new HashMap<>();
        for (char c:s.toCharArray()) {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int noOfOdds=0;
        for (int num: map.values()) {
            if(num%2!=0){
                noOfOdds++;
            }
        }
        if(k>noOfOdds){
            return true;
        }
        int ans=noOfOdds-k;
        return ans==0 || ans==1;
    }
}

