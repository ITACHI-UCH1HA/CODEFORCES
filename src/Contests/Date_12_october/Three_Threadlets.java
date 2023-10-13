package Contests.Date_12_october;
import java.util.*;

public class Three_Threadlets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume the newline after t
        while (t > 0) {
            List<Integer> list=new ArrayList<>();
            int min=Integer.MAX_VALUE;
            for (int i = 0; i < 3; i++) {
                int a= sc.nextInt();
                list.add(a);
                if(a<min){
                    min=a;
                }
            }
            int ans=Find(list,min);
            t--;
        }
        sc.close();
    }
    public static int Find(List<Integer> list,int min){
        for (int i = 0; i < 3; i++) {
            int n=list.size();
            for (int j = 0; j < n; j++) {
                if(list.get(j)==min){
                    list.remove(j);
                }
                if(list.get(j)>min){
                    list.set(j, list.get(j)-min);
                }
            }
        }
        return 1;
    }
}
