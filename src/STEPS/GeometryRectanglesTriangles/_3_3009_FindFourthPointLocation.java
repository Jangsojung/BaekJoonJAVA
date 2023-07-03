package STEPS.GeometryRectanglesTriangles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _3_3009_FindFourthPointLocation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] arrX = new int[3];
        int[] arrY = new int[3];

        for(int i = 0 ; i < 3 ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arrX[i] = Integer.parseInt(st.nextToken());
            arrY[i] = Integer.parseInt(st.nextToken());
        }

        if(arrX[0] == arrX[1]) {
            sb.append(arrX[2]).append(" ");
        } else {
            sb.append(arrX[0] == arrX[2] ? arrX[1] : arrX[0]).append(" ");
        }

        if(arrY[0] == arrY[1]) {
            sb.append(arrY[2]);
        } else {
            sb.append(arrY[0] == arrY[2] ? arrY[1] : arrY[0]);
        }

        System.out.println(sb);
    }
}