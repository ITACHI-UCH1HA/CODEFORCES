package year_2025.month_07.date_13;
import java.util.Scanner;
public class UnitArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            int[] nums = new int[n];

            int ones = 0;
            int negs = 0;

            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
                if(nums[i]==1){
                    ones++;
                }else{
                    negs++;
                }
            }

            if(negs>ones){
                int diff = negs-ones;

                if(diff%2==1){
                    System.out.println((diff/2)+1);
                }else{
                    System.out.println(diff/2);
                }
            } else if (negs%2==1) {
                System.out.println(1);
            }else {
                System.out.println(0);
            }
        }
    }
}
