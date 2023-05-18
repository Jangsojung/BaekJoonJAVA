package STEPS.IntensiveCourseOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _4_10988_CheckPalindrome {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int palindrome = 1;

        for(int i = 0 ; i < str.length() / 2 ; i++) {
            if (str.charAt(i) != str.charAt(str.length() - (i + 1))) {
                palindrome = 0;
                break;
            }
        }

        System.out.println(palindrome);
    }
}