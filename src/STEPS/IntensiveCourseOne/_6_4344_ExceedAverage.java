package STEPS.IntensiveCourseOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _6_4344_ExceedAverage {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int c = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < c ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int[] arr = new int[n];

            int sum = 0;
            for(int j = 0 ; j < n ; j++) {
                int num = Integer.parseInt(st.nextToken());
                arr[j] = num;
                sum += num;
            }

            int avg = sum / n;
            double avgCnt = 0;
            for(int j = 0 ; j < arr.length ; j++) {
                if(arr[j] > avg) {
                    avgCnt++;
                }
            }

            sb.append(String.format("%.3f", avgCnt / n * 100)).append("%\n");
        }

        System.out.print(sb);
    }
}