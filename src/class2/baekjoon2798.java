package class2;

import java.util.Scanner;

public class baekjoon2798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalCard = sc.nextInt();
        int maxNum = sc.nextInt();

        int[] cards = new int[totalCard];
        int max = 0;
        for (int i = 0; i < totalCard; i++) {
            cards[i] = sc.nextInt();
        }

        System.out.println(search(cards, totalCard, maxNum));


    }

    static int search(int[] cards, int totalCard, int maxNum) {
        int result = 0;

        for (int i = 0; i < totalCard; i++) {
            for (int j = i + 1; j < totalCard - 1; j++) {
                for (int k = j + 1; k < totalCard; k++) {
                    int temp = cards[i] + cards[j] + cards[k];

                    if(maxNum == temp) return temp;
                    if(result < temp && temp < maxNum) {
                        result = temp;
                    }
                }
            }
        }
        return result;
    }
}
