package STEPS.TimeComplexity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _6_24267_MenOfPassionSix {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Integer.parseInt(br.readLine());

        System.out.println(n * (n - 1) * (n - 2) / 6);
        System.out.println(3);
    }
}