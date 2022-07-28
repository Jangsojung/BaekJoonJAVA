package _4week;

import java.io.*;

//에라토스테네스의 체 : 소수가 되는 수의 배수를 지우면 남은건 소수가 된다.
public class Math1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int m = Integer.parseInt(str.split(" ")[0]);
        int n = Integer.parseInt(str.split(" ")[1]);

        boolean[] nPrime = new boolean[n + 1];
        nPrime[0] = nPrime[1] = true;

        //Math.sqrt : 제곱근(루트)
        //제곱근 범위 나뉘 법 : 제곱근을 기준으로 대칭적으로 곱이 일어나므로 제곱근 이하의 값까지만 검사하면 됨
        for (int i = 2; i <= Math.sqrt(nPrime.length); i++) {
            if (nPrime[i]) {
                continue;
            }
            for (int j = i * i; j < nPrime.length; j += i) {
                nPrime[j] = true;
            }
        }

        for (int i = m; i <= n; i++) {
            if (!nPrime[i]) {
                System.out.println(i);
            }
        }
    }
}

/*
1. 2부터 소수를 구하고자 하는 구간의 모든 수 나열
2. 소수가 되는 수의 배수를 지움
-> 2 / 2의 배수를 지움
-> 2, 3 / 3의 배수를 지움
-> 2, 3, 5 / 5의 배수를 지움 ...
 */