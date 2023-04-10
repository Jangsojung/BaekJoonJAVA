package STEPS.ConditionalStatements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _6_2525_OvenClock {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int takes_m = Integer.parseInt(br.readLine());

        int hour = Integer.parseInt(str.split(" ")[0]);
        int min = Integer.parseInt(str.split(" ")[1]);

        int plus_hour = takes_m / 60;
        int plus_min = takes_m % 60;

        hour += plus_hour;
        min += plus_min;

        if(min >= 60) {
            hour++;
            min -= 60;
        }

        if(hour >= 24) {
            hour -= 24;
        }

        System.out.println(hour + " " + min);
    }
}