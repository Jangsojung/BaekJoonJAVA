package STEPS.LoopStatements;

import java.io.*;

public class _2_10950_AplusBLoop {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < cnt ; i++) {
            String str = br.readLine();
            int a = Integer.parseInt(str.split(" ")[0]);
            int b = Integer.parseInt(str.split(" ")[1]);

            bw.write(a + b + "\n");
        }

        bw.flush();
        bw.close();
    }
}