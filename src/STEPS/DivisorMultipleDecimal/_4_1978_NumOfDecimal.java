package STEPS.DivisorMultipleDecimal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _4_1978_NumOfDecimal {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int result = 0;
        for(int i = 0 ; i < n ; i++) {
            int num = Integer.parseInt(st.nextToken());
            int cnt = 0;

            for (int j = 2; j <= num; j++) {
                if (num % j == 0) {
                    cnt++;
                }
            }

            if(cnt == 1) {
                result++;
            }
        }

        System.out.println(result);
    }
}