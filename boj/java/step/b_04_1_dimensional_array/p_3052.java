package java.step.b_04_1_dimensional_array;

import java.util.HashSet;
import java.util.Scanner;

public class p_3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet <Integer> set = new HashSet<> (10);

        for (int i = 0; i < 10; i++) {
            set.add(sc.nextInt() % 42);
        }
        sc.close();
        System.out.println(set.size());
    }
}
