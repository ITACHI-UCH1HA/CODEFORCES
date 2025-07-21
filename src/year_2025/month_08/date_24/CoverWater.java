package year_2025.month_08.date_24;

//https://codeforces.com/problemset/problem/1900/A

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoverWater {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());

        while (t-->0){
            int n = Integer.parseInt(bf.readLine());
            String s = bf.readLine();
            int count = 0;
            boolean contniousThreeDots = false;
            int dots = 0;
//            5
//            3
//            ...
//            7
//            ##....#
//            7
//            ..#.#..
//            4
//            ####
//            10
//            #...#..#.#

            for(char c:s.toCharArray()){
                if(c=='.'){
                    count++;
                    dots++;
                    if(count==3){
                        contniousThreeDots = true;
                        break;
                    }
                }else{
                    count=0;
                }
            }
            if(contniousThreeDots){
                System.out.println(2);
            }else{
                System.out.println(dots);
            }
//            char[] arr = s.toCharArray();
//            int len = arr.length;
//            for (int i = 0; i < len; i++) {
//                if(arr[i]=='.' && i+1<len && arr[i+1]=='.' && i+2<len && arr[i+2]=='.'){
//                    contniousThreeDots = true;
//                    break;
//                }
//                if(arr[i]=='.'){
//                    dots++;
//                }
//            }
//            if(contniousThreeDots){
//                System.out.println(2);
//            }else {
//                System.out.println(dots);
//            }
        }
    }
}
