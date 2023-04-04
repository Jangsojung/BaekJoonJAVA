package STEPS.InputOutputAndQuadraticOperations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _8_18108_BCtoAD {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int bc = Integer.parseInt(str);
        System.out.println(bc - 543);
    }
}