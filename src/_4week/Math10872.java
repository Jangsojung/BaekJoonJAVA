package _4week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Math10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int fac = 1;

        for(int i = 2 ; i <= N ; i++) {
            fac *= i;
        }

        System.out.println(fac);
    }

    /*
    static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        else {
            return n * factorial(n-1);
        }
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        System.out.println(factorial(N));
    }
    */
}
