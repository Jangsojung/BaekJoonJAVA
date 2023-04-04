package STEPS.InputOutputAndQuadraticOperations;

import java.io.*;

public class _11_11382_AplusBplusC {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        long a = Long.parseLong(str.split(" ")[0]);
        long b = Long.parseLong(str.split(" ")[1]);
        long c = Long.parseLong(str.split(" ")[2]);

        System.out.println(a + b + c);
    }
}

/*

문제의 범위가 10^12까지 가기 때문에 long으로 받는다!

int 범위: -2^31 ~ (2^31 - 1)
long 범위: -2^63 ~ (2^63 - 1)

 */