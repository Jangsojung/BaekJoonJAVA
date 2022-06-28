package _2week;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

/*class Stack {
	private ArrayList<Integer> arr;
	
	public Stack(int size) {
		arr = new ArrayList<>();
	}
	
	public void push(int X) {
		arr.add(X);
	}
	
	public int pop() {
		if(arr.isEmpty()) {
			return -1;
		}
		return arr.remove(arr.size() - 1);
	}
	
	public int size() {
		return arr.size();
	}
	
	public int empty() {
		if(arr.isEmpty()) {
			return 1;
		}
		return 0;
	}
	
	public int top() {
		if(arr.isEmpty()) {
			return -1;
		}
		return arr.get(arr.size() - 1);
	}
}*/

public class Stack10828_ArrayList {
	
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
