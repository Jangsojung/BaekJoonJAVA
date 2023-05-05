package STEPS.CharacterStrings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _6_10809_IndexOfAlphabet {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] alphabets = new int[26];

        for(int i = 0 ; i < alphabets.length ; i++) {
            alphabets[i] = -1;
        }

        String s = br.readLine();

        for(int i = 0 ; i < s.length() ; i++) {
            if(alphabets[s.charAt(i) - 97] == -1) {
                alphabets[s.charAt(i) - 97] = i;
            }
        }

        for(int alphabet : alphabets) {
            System.out.print(alphabet + " ");
        }
    }
}