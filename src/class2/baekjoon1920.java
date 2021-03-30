package class2;

import java.util.Scanner;

public class baekjoon1920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr1 = new int[N];
        for (int i = 0; i < N; i++) {
            arr1[i] = sc.nextInt();
        }
        int NN = sc.nextInt();
        int[] arr2 = new int[NN];
        for (int i = 0; i < NN; i++) {
            arr2[i] = sc.nextInt();
        }
        boolean is = false;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < NN; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.println(1);
                    break;
                } else {
                    if (is) System.out.println(0);

                }
            }
        }
    }
}
