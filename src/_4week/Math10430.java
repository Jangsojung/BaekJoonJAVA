package _4week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 모듈러 연산 : 나머지와 관련된 연산식
public class Math10430 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int A = Integer.parseInt(str.split(" ")[0]);
        int B = Integer.parseInt(str.split(" ")[1]);
        int C = Integer.parseInt(str.split(" ")[2]);

        System.out.println((A + B) % C);
        System.out.println(((A % C) + (B % C)) % C);
        /*
        A % C = T
        B % C = S

        A = T + iC (i는 임의의 정수)
        B = S + jC (j는 임의의 정수)

        (A + B) % C = ((T + iC) + (S + jC)) % C
                    = ((T + S) + (i + j)C) % C
                    = (T + S) % C
                    = ((A % C) + (B % C)) % C
         */

        System.out.println((A * B) % C);
        System.out.println(((A % C) * (B % C)) % C);
        /*
        A % C = T
        B % C = S

        A = T + iC (i는 임의의 정수)
        B = S + jC (j는 임의의 정수)

        (A * B) % C = ((T + iC) * (S + jC)) % C
                    = (TS + TjC + SiC + (ij)C²) % C
                    = (TS) % C
                    = ((A % C) * (B % C)) % C
         */
    }
}