package STEPS.InputOutputAndQuadraticOperations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _3_1001_AminusB {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int a = Integer.parseInt(str.split(" ")[0]);
        int b = Integer.parseInt(str.split(" ")[1]);

        System.out.println(a - b);
    }
}