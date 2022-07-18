package _3week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Josephus1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Integer> list = new LinkedList<>();

        String str = br.readLine();
        int N = Integer.parseInt(str.split(" ")[0]);
        int K = Integer.parseInt(str.split(" ")[1]);

        for(int i = 1 ; i <= N ; i++) {
            list.add(i);
        }

        System.out.print("<");
        while(!list.isEmpty()) {
            for(int i = 0 ; i < K ; i++) {
                if(i == K - 1) {
                    int num = list.remove();
                    if(list.size() == 0) {
                        System.out.print(num + ">");
                    }
                    else {
                        System.out.print(num + ", ");
                    }
                }
                else {
                    list.add(list.remove());
                }
            }
        }
    }
}