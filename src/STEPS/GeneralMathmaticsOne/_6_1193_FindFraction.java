package STEPS.GeneralMathmaticsOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _6_1193_FindFraction {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());

        int count = 1, sum = 0;

        while (true) {
            if(x <= sum + count) {
                if(count % 2 == 0) {
                    System.out.println((x - sum) + "/" + (count - (x - sum - 1)));
                } else {
                    System.out.println((count - (x - sum - 1)) + "/" + (x - sum));
                }
                break;
            } else {
                sum += count;
                count++;
            }
        }
    }
}