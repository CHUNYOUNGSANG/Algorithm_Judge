package java.step.b_01_input_output_and_arithmetic_operations;

import java.util.Scanner;

public class p_1001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.println(A - B);

        sc.close();
    }
}
