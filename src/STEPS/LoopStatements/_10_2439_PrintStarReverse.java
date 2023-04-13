package STEPS.LoopStatements;

import java.io.*;

public class _10_2439_PrintStarReverse {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < cnt ; i++) {
            for(int m = cnt - (i + 1) ; m > 0 ; m--) {
                bw.write(" ");
            }
            for(int n = 0 ; n < i + 1 ; n++) {
                bw.write("*");
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
    }
}