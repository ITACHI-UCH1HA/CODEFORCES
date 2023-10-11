package Year_2023.Month_10.Date_11;

import java.util.Scanner;

public class Rigged {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t>0){
            int n= sc.nextInt();
            int[] strength=new int[n];
            int[] endurance=new int[n];
            for (int i = 0; i < n; i++) {
                strength[i] = sc.nextInt();
                endurance[i] = sc.nextInt();
            }
//          calculate the weight
            int weight=WeightCal(strength,endurance);
            System.out.println(weight);
            t--;
        }
    }

    private static int WeightCal(int[] strength, int[] endurance) {
        for (int i = 1;i < strength.length;i++){
            if(strength[i]>=strength[0] && endurance[i]>=endurance[0]){
                return -1;
            }
        }
        return strength[0];
    }
}
