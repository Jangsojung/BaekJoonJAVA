package STEPS.IntensiveCourseOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _3_2444_PrintStarDiamond {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 1 ; i <= n ; i++) {
            for(int j = 0 ; j < n - i ; j++) {
                sb.append(" ");
            }
            for(int j = 0 ; j < 2 * i - 1 ; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }

        for (int i = n - 1 ; i >= 0 ; i--) {
            for(int j = 0 ; j < n - i ; j++) {
                sb.append(" ");
            }
            for(int j = 0 ; j < 2 * i - 1 ; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }
}