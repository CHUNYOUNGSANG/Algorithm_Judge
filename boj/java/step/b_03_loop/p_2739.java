package java.step.b_03_loop;

import java.util.Scanner;

public class p_2739 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int N = sc.nextInt();

        for(int i = 1; i <= 9; i++) {
            System.out.println(N + " * " + i + " = " + N * i);
        }
        sc.close();
    }
}
