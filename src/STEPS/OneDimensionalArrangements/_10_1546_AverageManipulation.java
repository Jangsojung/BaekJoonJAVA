package STEPS.OneDimensionalArrangements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _10_1546_AverageManipulation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] scores = new int[n];

        int sum = 0;
        for(int i = 0 ; i < n ; i++) {
            scores[i] = Integer.parseInt(st.nextToken());
            sum += scores[i];
        }

        Arrays.sort(scores);
        int max = scores[n - 1];

        System.out.println((double)sum / max * 100 / n);
    }
}