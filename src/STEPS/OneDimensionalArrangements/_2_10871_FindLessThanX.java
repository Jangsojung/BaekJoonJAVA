package STEPS.OneDimensionalArrangements;

import java.io.*;
import java.util.StringTokenizer;

public class _2_10871_FindLessThanX {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br. readLine());

        int cnt = Integer.parseInt(st.nextToken());
        int standard = Integer.parseInt(st.nextToken());

        int[] arr = new int[cnt];

        StringTokenizer st2 = new StringTokenizer(br. readLine());

        for(int i = 0 ; i < arr.length ; i++) {
            arr[i] = Integer.parseInt(st2.nextToken());
            if(arr[i] < standard) {
                bw.write(arr[i] + " ");
            }
        }

        bw.flush();
        bw.close();
    }
}