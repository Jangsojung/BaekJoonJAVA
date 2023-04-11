package STEPS.LoopStatements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _4_Receipt {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());

        int cnt = Integer.parseInt(br.readLine());
        int sum = 0;

        for(int i = 0 ; i < cnt ; i++) {
            String str = br.readLine();
            int price = Integer.parseInt(str.split(" ")[0]);
            int num = Integer.parseInt(str.split(" ")[1]);

            sum += price * num;
        }

        if(total == sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}