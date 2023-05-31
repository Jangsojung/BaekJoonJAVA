package STEPS.TwoDemensionalArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2_2566_FindMaximum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = Integer.MIN_VALUE;
        int maxI = -1, maxJ = -1;

        for(int i = 0 ; i < 9 ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j < 9 ; j++) {
                int num = Integer.parseInt(st.nextToken());
                if(num > max) {
                    max = num;
                    maxI = i;
                    maxJ = j;
                }
            }
        }

        System.out.println(max);
        System.out.println((maxI + 1) + " " + (maxJ + 1));
    }
}