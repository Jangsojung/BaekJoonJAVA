package STEPS.IntensiveCourseOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _8_1316_CheckGroupWords {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int cnt = n;

        for(int i = 0 ; i < n ; i++) {
            boolean[] alphabets = new boolean[26];
            String str = br.readLine();

            alphabets[str.charAt(0) - 'a'] = true;

            for(int j = 1 ; j < str.length() ; j++) {
                if (str.charAt(j) == str.charAt(j - 1)) {
                    continue;
                } else if (alphabets[str.charAt(j) - 'a']){
                    cnt--;
                    break;
                }
                alphabets[str.charAt(j) - 'a'] = true;
            }
        }

        System.out.println(cnt);
    }
}