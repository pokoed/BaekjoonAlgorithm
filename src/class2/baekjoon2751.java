package class2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class baekjoon2751 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }

        Collections.sort(list);

        for (int val : list) sb.append(val).append('\n');
        System.out.println(sb);
    }

}
