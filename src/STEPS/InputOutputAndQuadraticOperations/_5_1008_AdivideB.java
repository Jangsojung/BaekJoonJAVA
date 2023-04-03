package STEPS.InputOutputAndQuadraticOperations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5_1008_AdivideB {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        double a = Integer.parseInt(str.split(" ")[0]);
        double b = Integer.parseInt(str.split(" ")[1]);

        System.out.println(a / b);
    }
}