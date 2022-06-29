package _2week;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class PS9012 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int count = Integer.parseInt(br.readLine());

		for (int i = 0; i < count; i++) {
			String str = br.readLine();
			Stack<Character> st = new Stack<>();
			boolean check = true;

			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == '(') {
					if(j == str.length() - 1) {
						check = false;
						break;
					}
					st.push('(');
				} else if (str.charAt(j) == ')') {
					if (!st.empty()) {
						if (st.peek() == '(') {
							st.pop();
						} else {
							check = false;
							break;
						}
					} else {
						check = false;
						break;
					}
				}
			}
			if (check && st.empty()) {
				bw.write("YES\n");
			} else {
				bw.write("NO\n");
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}

}
