package _2week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Editor1406 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int count = Integer.parseInt(br.readLine());
		
		Stack<Character> left = new Stack<>();
		Stack<Character> right = new Stack<>();
		
		for(int i = 0 ; i < str.length() ; i++) {
			left.push(str.charAt(i));
		}
		
		for(int i = 0 ; i < count ; i++) {
			String order = br.readLine();
			
			switch(order.charAt(0)) {
			case 'L':
				if(!left.empty()) {
					right.push(left.pop());
				}
				break;
			case 'D':
				if(!right.empty()) {
					left.push(right.pop());
				}
				break;
			case 'B':
				if(!left.empty()) {
					left.pop();
				}
				break;
			case 'P':
				left.push(order.charAt(2));
				break;
			}
		}
		
		while(!left.isEmpty()) {
			right.push(left.pop());
		}

		while(!right.isEmpty()) {
			System.out.print(right.pop());
		}
		
	}

}
