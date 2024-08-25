package java.step.b_03_loop;

import java.util.Scanner;

public class p_25314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a = N / 4;

        for (int i = 0; i < a; i++) {
            System.out.print("long ");
        }
        System.out.println("int");
        sc.close();
    }
}