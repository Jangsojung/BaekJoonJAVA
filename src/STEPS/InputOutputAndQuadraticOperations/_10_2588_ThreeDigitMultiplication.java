package STEPS.InputOutputAndQuadraticOperations;

import java.io.*;

public class _10_2588_ThreeDigitMultiplication {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        String str2 = br.readLine();
        /*

        int b = Integer.parseInt(str2);
        int b_first = Integer.parseInt(str2.split("")[0]);
        int b_second = Integer.parseInt(str2.split("")[1]);
        int b_third = Integer.parseInt(str2.split("")[2]);

        bw.write(a * b_third + "\n");
        bw.write(a * b_second + "\n");
        bw.write(a * b_first + "\n");
        bw.write(a * b + "\n");

        */

        bw.write(a * (str2.charAt(2) - '0') + "\n");
        bw.write(a * (str2.charAt(1) - '0') + "\n");
        bw.write(a * (str2.charAt(0) - '0') + "\n");
        bw.write(a * Integer.parseInt(str2) + "\n");

        bw.flush();
        bw.close();
    }
}