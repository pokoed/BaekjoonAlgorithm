package class2;

import java.util.Scanner;

public class baekjoon2609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int tmp1 = a;
        int tmp2 = b;
        int r = 1;

        int GCD, LCM;
        if(a < b) {
            a = tmp2;
            b = tmp1;
        }
        while(r>0) {
            r = a % b;
            a = b;
            b = r;
        }
        LCM = tmp1 * tmp2 / a; // 최소공배수 구하기
        GCD = a;

        System.out.println(GCD);
        System.out.println(LCM);
    }
}
