package STEPS.OneDimensionalArrangements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _3_10818_FindMinMax {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

        for(int i = 0 ; i < cnt ; i++) {
            int now = Integer.parseInt(st.nextToken());
            min = Integer.min(now, min);
            max = Integer.max(now, max);
        }

        System.out.println(min + " " + max);
    }
}