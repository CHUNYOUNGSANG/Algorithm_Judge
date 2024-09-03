package java.step.b_04_1_dimensional_array;

import java.util.Scanner;

public class p_5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] st = new int[31];

        for (int i = 1; i < 29; i++) {
            int ss = sc.nextInt();
            st[ss] = 1;
        }
        for (int i = 1; i < st.length; i++) {
            if (st[i] != 1)
                System.out.println(i);
        }
        sc.close();
    }
}
