package _4week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Math1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();

        int cnt = 0;

        for(int i = 0 ; i < N ; i++) {
            int num = Integer.parseInt(str.split(" ")[i]);

            for(int j = 2 ; j <= num ; j++) {
                if(num == j) {
                    cnt++;
                }
                if(num % j == 0) {
                    break;
                }
            }
        }
        System.out.println(cnt);
    }
}