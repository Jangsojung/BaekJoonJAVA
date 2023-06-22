package STEPS.DivisorMultipleDecimal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _3_9506_PerfectNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true) {
            int num = Integer.parseInt(br.readLine());

            if(num == -1) {
                break;
            }

            int sum = 0;
            int[] factors = new int[num];
            int cnt = 0;
            for(int i = 1 ; i < num ; i++) {
                if(num % i == 0) {
                    sum += i;
                    factors[cnt++] = i;
                }
            }

            if(sum == num) {
                sb.append(num).append(" = ");
                for(int i = 0 ; i < cnt ; i++) {
                    if(i == cnt - 1) {
                        sb.append(factors[i]).append("\n");
                        break;
                    }
                    sb.append(factors[i]).append(" + ");
                }
            } else {
                sb.append(num).append(" is NOT perfect.\n");
            }
        }

        System.out.print(sb);
    }
}