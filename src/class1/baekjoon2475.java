package class1;

import java.util.Scanner;

public class baekjoon2475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int result = 0;
        for (int i = 0; i < 5; i++) {
            int temp = sc.nextInt();
            result += temp * temp;
        }
        System.out.println(result%10);
    }
}
