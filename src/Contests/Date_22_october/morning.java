package Contests.Date_22_october;
import java.util.*;
public class morning {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t>0){
            String pin= sc.nextLine();
            int sum=0;
            int arr[]={1,2,3,4,5,6,7,8,9,0};
            int p=0;
            for (char c:pin.toCharArray()) {
                int i=Character.getNumericValue(c);
                if(arr[p]==i){
                    sum++;
                }
                else if(i==0){
                    sum+=arr.length-p;
                    p=arr.length-1;
                }else if(p>i-1){
                    sum+=arr[p]-i+1;
                    p= arr.length-p-i;
                }else{
                    sum+=i-arr[p]+1;
                    p=i-arr[p];
                }
            }
            System.out.println(sum);
            t--;
        }
    }
}
