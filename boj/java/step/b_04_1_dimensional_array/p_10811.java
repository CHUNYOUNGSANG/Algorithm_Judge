package java.step.b_04_1_dimensional_array;

import java.util.Scanner;

public class p_10811 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] baskets = new int[N];

        for (int i = 0; i < N; i++) {
            baskets[i] = i + 1;
        }

        for (int k = 0; k < M; k++) {
            int start = sc.nextInt() - 1;
            int end = sc.nextInt() - 1;

            for (int j = 0; j <= (end - start) / 2; j++) {
                int temp = baskets[start + j];
                baskets[start + j] = baskets[end - j];
                baskets[end - j] = temp;
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.print(baskets[i] + " ");
        }
        sc.close();
    }
}