package _2week;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class StackSequence1874 {

	//BufferedWriter 사용시 출력 초과가 뜸 -> StringBuilder 사용
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int count = Integer.parseInt(br.readLine());
		
		Stack<Integer> st = new Stack<>();
		
		int cNum = 1;
		
		for(int i = 0 ; i < count ; i++) {
			int num = Integer.parseInt(br.readLine());
			
			if(cNum > num && st.peek() != num) {
				System.out.println("NO");
				return;
			}
			
			else if(cNum <= num) {
				while(cNum <= num && num <= count) {
					st.push(cNum++);
					//bw.write("+\n");
					sb.append("+\n");
				}
				
			}
			if(st.peek() == num) {
				st.pop();
				//bw.write("-\n");
				sb.append("-\n");
			}
		}
		
		//bw.flush();
		//bw.close();
		System.out.println(sb);
		br.close();
	}

}
