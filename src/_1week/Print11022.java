package _1week;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Print11022 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());

		for(int i = 0 ; i < T ; i++) {
			String str = br.readLine();
			if(str == null) {
				break;
			}
			int A = Integer.parseInt(str.split(" ")[0]);
			int B = Integer.parseInt(str.split(" ")[1]);

			bw.write("Case #" + (i+1) + ": " + A + " + " + B + " = " + (A + B) + "\n");
		}

		bw.flush();
		bw.close();
		br.close();
	}
}
