package STEPS.IntensiveCourseOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5_1157_MaxAlphabet {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toUpperCase();

        int[] alphabets = new int[26];
        for(int i = 0 ; i < str.length() ; i++) {
            int p = str.charAt(i) - 'A';
            alphabets[p]++;
        }

        int max = Integer.MIN_VALUE;
        char result = '?';
        for(int i = 0 ; i < alphabets.length ; i++) {
            if(alphabets[i] > max) {
                max = alphabets[i];
                result = (char)(i + 'A');
            } else if(max == alphabets[i]) {
                result = '?';
            }
        }

        System.out.println(result);
    }
}