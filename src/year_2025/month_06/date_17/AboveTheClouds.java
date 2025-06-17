package year_2025.month_06.date_17;


import java.util.*;

public class AboveTheClouds {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {
            //inputs
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();

            Set<Character> set = new HashSet<>();

            boolean found = false;

            set.add(s.charAt(0));
            set.add(s.charAt(s.length()-1));

            for(int i=1; i<s.length()-1; i++){
                char c = s.charAt(i);
                if(set.contains(c)){
                    System.out.println("Yes");
                    found = true;
                    break;
                }
                set.add(c);
            }

            if(!found){
                System.out.println("No");
            }
            t--;
        }
    }
}
