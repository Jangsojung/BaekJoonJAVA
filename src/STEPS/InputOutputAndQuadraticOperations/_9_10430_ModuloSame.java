package STEPS.InputOutputAndQuadraticOperations;

import java.io.*;

public class _9_10430_ModuloSame {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        int a = Integer.parseInt(str.split(" ")[0]);
        int b = Integer.parseInt(str.split(" ")[1]);
        int c = Integer.parseInt(str.split(" ")[2]);

        bw.write((a + b) % c + "\n");
        bw.write(((a % c) + (b % c)) % c + "\n");
        bw.write((a * b) % c + "\n");
        bw.write(((a % c) * (b % c)) % c + "\n");

        bw.flush();
        bw.close();
    }
}