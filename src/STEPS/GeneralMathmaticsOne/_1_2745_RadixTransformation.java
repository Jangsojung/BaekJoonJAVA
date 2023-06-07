package STEPS.GeneralMathmaticsOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1_2745_RadixTransformation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String str = st.nextToken();
        int n = Integer.parseInt(st.nextToken());

        int result = 0;
        for(int i = 0 ; i < str.length() ; i++) {
            int num = str.charAt(i) - 55;
            if(num < 10) {
                num += 7;
            }
            result += num * Math.pow(n, str.length() - i - 1);
        }

        System.out.println(result);
    }
}