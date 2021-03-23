package class2;

import java.util.Scanner;

public class baekjoon11050 {
    private static int choose(int n, int k) {
        if(n == k || k == 0) return 1;

        return choose(n - 1, k - 1) + choose(n - 1, k);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(choose(n, k));
    }
}
