package java.step.b_02_conditional_statement;

import java.util.Scanner;

public class p_2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hh = sc.nextInt();
        int mm = sc.nextInt();

        if (mm < 45) {
            hh--;
            mm = 60 - (45 - mm);
            if (hh < 0) {
                hh = 23;
            }
            System.out.println(hh + " " + mm);
        } else {
            System.out.println(hh + " " + (mm - 45));
        }
        sc.close();
    }

}