package STEPS.LoopStatements;

import java.io.*;

public class _12_10951_AplusBUntilBlank {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String str = br.readLine();

            if(str == null) {
                break;
            }

            int a = Integer.parseInt(str.split(" ")[0]);
            int b = Integer.parseInt(str.split(" ")[1]);

            bw.write(a + b + "\n");
        }

        bw.flush();
        bw.close();
    }
}