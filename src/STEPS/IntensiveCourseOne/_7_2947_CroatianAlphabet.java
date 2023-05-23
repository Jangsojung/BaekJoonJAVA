package STEPS.IntensiveCourseOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _7_2947_CroatianAlphabet {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for(int i = 0 ; i < arr.length ; i++) {
            int index = str.indexOf(arr[i]);

            if(index > -1) {
                str = str.replaceAll(arr[i], "a");
            }
        }

        System.out.println(str.length());
    }
}