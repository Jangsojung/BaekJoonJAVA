package STEPS.OneDimensionalArrangements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1_10807_CountInteger {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());
        int[] arr = new int[cnt];

        String str = br.readLine();
        for(int i = 0 ; i < arr.length ; i++) {
            arr[i] = Integer.parseInt(str.split(" ")[i]);
        }

        int find = Integer.parseInt(br.readLine());
        int find_cnt = 0;
        for (int j : arr) {
            if (j == find) {
                find_cnt++;
            }
        }

        System.out.println(find_cnt);
    }

/*    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());
        String str = br.readLine();

        int find = Integer.parseInt(br.readLine());
        int find_cnt = 0;

        for(int i = 0 ; i < cnt ; i++) {
            if(Integer.parseInt(str.split(" ")[i]) == find) {
                find_cnt++;
            }
        }

        System.out.println(find_cnt);
    }*/
}