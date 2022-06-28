package _2week;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Stack {
	private int[] arr;
	private int top;
	
	public Stack(int size) {
		arr = new int[size];
		top = -1;
	}
	
	public void push(int X) {
		arr[++top] = X;
	}
	
	public int pop() {
		if (top == -1) {
			return -1;
		}
		int num = arr[top--];
		return num;
	}
	
	public int size() {
		return top + 1;
	}
	
	public int empty() {
		if(top == -1) {
			return 1;
		}
		return 0;
	}
	
	public int top() {
		if(top == -1) {
			return -1;
		}
		return arr[top];
	}
}

public class Stack10828 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = Integer.parseInt(br.readLine());
		
		Stack st = new Stack(count);
		
		for(int i = 0 ; i < count ; i++) {
			String str = br.readLine();
			if(str.contains(" ")) {
				st.push(Integer.parseInt(str.split(" ")[1]));
			}
			else {
				switch(str) {
				case "pop":
					bw.write(st.pop() + "\n");
					break;
				case "size":
					bw.write(st.size() + "\n");
					break;
				case "empty":
					bw.write(st.empty() + "\n");
					break;
				case "top":
					bw.write(st.top() + "\n");
					break;
				}
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
