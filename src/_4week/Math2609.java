package _4week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Math2609 {
    public static int gcd(int a, int b) {
        while(b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int a = Integer.parseInt(str.split(" ")[0]);
        int b = Integer.parseInt(str.split(" ")[1]);

        System.out.println(gcd(a, b));
        System.out.println(lcm(a, b));
    }
}

//GCD : Greatest Common Divisor
/*
유클리드 호제법(Euclidean Algorithm) : 두 수가 서로 나눠 원하는 수를 얻는 알고리즘
r = A mod B (0 <= r < B, A >= B)
GCD(A, B) = GCD(B, r)

r = A mod B (0 <= r < B)
A = Bq + r (q는 임의의 정수)
GCD(A, B) = d
=> A = ad, B = bd (a와 b는 서로소, d는 최대공약수)
r = A - Bq (A = Bq + r 이항)
r = ad - bdq
  = (a - bq)d
=> B = bd , r = (a - bq)d => d는 B와 r의 공약수
=> 최대 공약수 증명 : b와 (a - bq)가 서로소가 아니라고 한 뒤 모순 도출 : 서로소가 아니다 = 공약수를 갖는다

 */

//LCM : Least Common Multiple
/*
A = ad, B = bd, a와 b는 서로소, d는 최대공약수
=> 두 수의 소인수분해 한 결과의 공통 부분이 최대공약수, 즉 d
=> 최소 공배수 : a * b * d
위의 문제에서는 A = ad, B = bd였으므로, d가 한번 더 들어가므로
A * B / d
 */