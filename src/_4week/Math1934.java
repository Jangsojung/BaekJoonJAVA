package _4week;

import java.io.*;

public class Math1934 {
    public static int gcd(int a, int b) {
        while(b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < T ; i++) {
            String str = br.readLine();

            int A = Integer.parseInt(str.split(" ")[0]);
            int B = Integer.parseInt(str.split(" ")[1]);

            int d = gcd(A, B);

            bw.write(A * B / d + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}