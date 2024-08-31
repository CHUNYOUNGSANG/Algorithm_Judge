package java.step.b_04_1_dimensional_array;

import java.io.*;

public class p_10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] NX = br.readLine().split(" ");
        int N = Integer.parseInt(NX[0]);
        int X = Integer.parseInt(NX[1]);

        String[] input = br.readLine().split(" ");

        for (int i = 0; i < N; i++) {
            int A = Integer.parseInt(input[i]);
            if (A < X) {
                bw.write(A + " ");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}