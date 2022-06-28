package _2week;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class FlipOver9093 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int count = Integer.parseInt(br.readLine());
		
		for(int i = 0 ; i < count ; i++) {
			Stack<Character> stack = new Stack<>();
			String str = br.readLine() + "\n";
			
			for(int j = 0 ; j < str.length() ; j++) {
				if(str.charAt(j) == ' ' || str.charAt(j) == '\n') {
					while(!stack.isEmpty()) {
						bw.write(stack.pop());
					}
					bw.write(" ");
				}
				else {
					stack.add(str.charAt(j));
				}
			}
			bw.write("\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}

}
