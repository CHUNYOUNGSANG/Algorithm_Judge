package java.step.b_02_conditional_statement;

import java.util.Scanner;

public class p_1330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        if (A > B) {
            System.out.println(">");
        } else if (A < B) {
            System.out.println("<");
        } else {
            boolean a = A == B; {
                System.out.println("==");
            }
        }
        sc.close();
    }
}