package class1;

import java.util.Scanner;

public class baekjoon2920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result = "";
        int[] tmp = new int[8];
        String temp = "";

        for (int i = 1; i < 9; i++) {
            tmp[i - 1] = sc.nextInt();
            if (tmp[i - 1] == i) {
                result = result + "a";
            }
        }
        if (result.equals("aaaaaaaa")) {
            result = "ascending";
        } else {

            int k = 0;
            for (int j = 7; j > 0; j--) {
                if (tmp[k] == j + 1) {
                    temp = temp + "d";
                    k++;
                } else {
                    result = "mixed";
                }

            }

            if (temp.equals("ddddddd")) result = "descending";

        }
            System.out.println(result);
    }
}
