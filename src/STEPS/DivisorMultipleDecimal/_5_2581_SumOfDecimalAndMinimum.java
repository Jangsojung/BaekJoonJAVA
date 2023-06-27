package STEPS.DivisorMultipleDecimal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5_2581_SumOfDecimalAndMinimum {
    private static boolean checkDecimal(int n) {
        if(n != 1) {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        int sum = 0, min = Integer.MAX_VALUE;
        for(int i = m ; i <= n ; i++) {
            if(checkDecimal(i)) {
                if(sum == 0) {
                    min = i;
                }
                sum += i;
            }
        }

        if(sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}