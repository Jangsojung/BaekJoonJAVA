package STEPS.OneDimensionalArrangements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _8_3052_RemainderDividedBy42 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[43];
        for(int i = 0 ; i < 10 ; i++) {
            int num = Integer.parseInt(br.readLine());
            int remainder = num % 42;

            arr[remainder]++;
        }

        int count = 0;
        for(int i : arr) {
            if(i != 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}