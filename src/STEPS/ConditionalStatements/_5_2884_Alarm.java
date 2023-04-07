package STEPS.ConditionalStatements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5_2884_Alarm {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int hour = Integer.parseInt(str.split(" ")[0]);
        int min = Integer.parseInt(str.split(" ")[1]);

        if (min < 45) {
            hour--;
            min += 15;

            if (hour < 0) {
                hour = 23;
            }
            System.out.println(hour + " " + min);
        } else {
            System.out.println(hour + " " + (min - 45));
        }
    }
}