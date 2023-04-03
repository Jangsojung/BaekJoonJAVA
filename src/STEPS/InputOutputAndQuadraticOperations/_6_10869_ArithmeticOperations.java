package STEPS.InputOutputAndQuadraticOperations;

import java.io.*;

public class _6_10869_ArithmeticOperations {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        int a = Integer.parseInt(str.split(" ")[0]);
        int b = Integer.parseInt(str.split(" ")[1]);

        bw.write(a + b + "\n");
        bw.write(a - b + "\n");
        bw.write(a * b + "\n");
        bw.write(a / b + "\n");
        bw.write(a % b + "\n");

        bw.flush();
        bw.close();
    }
}