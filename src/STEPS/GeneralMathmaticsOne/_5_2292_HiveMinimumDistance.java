package STEPS.GeneralMathmaticsOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5_2292_HiveMinimumDistance {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int count = 1, range = 1;

        while(range < n) {
            range += 6 * count;
            count++;
        }
        System.out.println(count);
    }
}