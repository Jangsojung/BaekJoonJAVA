package STEPS.IntensiveCourseOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2_3003_CheckChessPieces {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int[] base = {1, 1, 2, 2, 2, 8};

        for(int i = 0 ; i < base.length ; i++) {
            sb.append(base[i] - Integer.parseInt(st.nextToken())).append(" ");
        }

        System.out.println(sb);
    }
}