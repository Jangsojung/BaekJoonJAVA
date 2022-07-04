package _3week;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Queue {
	private int[] q;
	int front, back;
	
	public Queue(int num) {
		q = new int[num];
		front = -1;
		back = -1;
	}
	
	public void push(int num) {
		q[++back] = num;
	}
	
	public int pop() {
		if(back != front) {
			return q[++front];
		}
		return -1;
	}
	
	public int size() {
		return back - front;
	}
	public int empty() {
		if(front == back) {
			return 1;
		}
		return 0;
	}
	
	public int front() {
		if(front == back) {
			return -1;
		}
		return q[front + 1];
	}
	
	public int back() {
		if(front == back) {
			return -1;
		}
		return q[back];
	}
}

public class Queue10845 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = Integer.parseInt(br.readLine());
		Queue q = new Queue(count);
		
		for(int i = 0 ; i < count ; i++) {
			String str = br.readLine();
			
			switch(str.split(" ")[0]) {
			case "push":
				q.push(Integer.parseInt(str.split(" ")[1]));
				break;
			case "pop":
				bw.write(q.pop() + "\n");
				break;
			case "size":
				bw.write(q.size() + "\n");
				break;
			case "empty":
				bw.write(q.empty() + "\n");
				break;
			case "front":
				bw.write(q.front() + "\n");
				break;
			case "back":
				bw.write(q.back() + "\n");
				break;
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}

}
