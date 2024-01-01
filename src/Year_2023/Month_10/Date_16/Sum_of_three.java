package Year_2023.Month_10.Date_16;
import java.util.*;
public class Sum_of_three {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        sc.nextLine();

        while (t > 0) {
            int n= sc.nextInt();
            int carry=n%3;
            int a=n/3,b=n/3,c=n/3;



//            if(checking(a,b,c)){
//                System.out.println("YES");
//                System.out.println(a+" "+b+" "+c);
//            }else{
//                int[] arr=readjusting(a,b,c);
//                if(arr.length==0){
//                    System.out.println("NO");
//                }else{
//                    System.out.println("YES");
//                    for (int i = 0; i < arr.length; i++) {
//                        System.out.print(arr[i]+" ");
//                    }
//                    System.out.println();
//                }
//            }
            t--;
        }
    }

    private static int[] readjusting(int a, int b, int c) {
        List<Integer> ans=new ArrayList<>();

        return new int[]{};
    }

    public static boolean checking(int a,int b,int c){
        return (a%3)!=0 && (b%3)!=0 && (c%3)!=0;
    }
    public static boolean checking(int a,int b){
        return (a%3)!=0 && (b%3)!=0;
    }
    public static boolean checking(int a){
        return (a%3)!=0;
    }
}
