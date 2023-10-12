package Contests.Date_12_october;
import java.util.*;

public class Perfect_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume the newline character after reading t

        while (t > 0) {
            int n = sc.nextInt();
            sc.nextLine(); // Consume the newline character after reading n

            char[][] matrix = new char[n][n];
            for (int i = 0; i < n; i++) {
                String row = sc.next(); // Read the whole line as a string
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = row.charAt(j);
                }
            }

            int count = 0;
            for (int i = 1; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (matrix[i][j] != matrix[j][i]) {
                        count++;
                    }
                }
            }
            System.out.println(count);
            t--;
        }
    }
}
