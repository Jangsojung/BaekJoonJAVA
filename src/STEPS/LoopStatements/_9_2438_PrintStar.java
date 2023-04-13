package STEPS.LoopStatements;

import java.io.*;

public class _9_2438_PrintStar {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < cnt ; i++) {
            for(int j = 0 ; j < i + 1 ; j++) {
                bw.write("*");
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
    }
}