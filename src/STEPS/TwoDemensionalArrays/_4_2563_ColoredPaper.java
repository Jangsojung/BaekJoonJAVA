package STEPS.TwoDemensionalArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _4_2563_ColoredPaper {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int cnt = Integer.parseInt(br.readLine());
        boolean[][] paper = new boolean[100][100];
        int result = 0;

        for(int i = 0 ; i < cnt ; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for(int m = x ; m < x + 10 ; m++) {
                for(int n = y ; n < y + 10 ; n++) {
                    if(!paper[m][n]) {
                        result++;
                        paper[m][n] = true;
                    }
                }
            }
        }

        System.out.println(result);
    }
}