package _4week;

import java.io.*;
import java.util.LinkedList;

class Deque {
    LinkedList<Integer> list;
    int front;
    int back;

    public Deque() {
        list = new LinkedList<>();
        front = 0;
        back = 0;
    }

    public void push_front(int X) {
        list.add(0, X);
    }
    public void push_back(int X) {
        list.add(X);
    }
    public int pop_front() {
        if(empty() == 0) {
            return list.remove(0);
        }
        return -1;
    }
    public int pop_back() {
        if(empty() == 0) {
            back--;
            return list.remove(list.size() - 1);
        }
        return -1;
    }
    public int size() {
        return list.size();
    }
    public int empty() {
        if(list.size() == 0) {
            return 1;
        }
        return 0;
    }
    public int front() {
        if(empty() == 0) {
            return list.get(0);
        }
        return -1;
    }
    public int back() {
        if(empty() == 0) {
            return list.get(list.size() - 1);
        }
        return -1;
    }
}

public class Deque10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        Deque dq = new Deque();

        for(int i = 0 ; i < N ; i++) {
            String str = br.readLine();

            switch(str.split(" ")[0]) {
                case "push_front":
                    dq.push_front(Integer.parseInt(str.split(" ")[1]));
                    break;
                case "push_back":
                    dq.push_back(Integer.parseInt(str.split(" ")[1]));
                    break;
                case "pop_front":
                    bw.write(dq.pop_front() + "\n");
                    break;
                case "pop_back":
                    bw.write(dq.pop_back() + "\n");
                    break;
                case "size":
                    bw.write(dq.size() + "\n");
                    break;
                case "empty":
                    bw.write(dq.empty() + "\n");
                    break;
                case "front":
                    bw.write(dq.front() + "\n");
                    break;
                case "back":
                    bw.write(dq.back() + "\n");
                    break;
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}