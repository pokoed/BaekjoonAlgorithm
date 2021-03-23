package class2;

import java.util.Scanner;

public class baekjoon1259 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean handler = true;

        while (handler) {

            int num = sc.nextInt();
            int reversed = 0;
            if(num == 0) {
                break;
            }
            int numCopy = num;
            while (numCopy != 0) {

                int digit = numCopy % 10;
                reversed = reversed * 10 + digit;
                numCopy /= 10;
            }
            if (num == reversed) System.out.println("yes");
            else System.out.println("no");
        }
    }
}
