package STEPS.GeneralMathmaticsOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _3_2720_GetChange {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        final int QUARTER = 25;
        final int DIME = 10;
        final int NICKEL = 5;
        final int PENNY = 1;

        int t = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < t ; i++) {
            int c = Integer.parseInt(br.readLine());
            sb.append(c / QUARTER).append(" ");
            c %= QUARTER;
            sb.append(c / DIME).append(" ");
            c %= DIME;
            sb.append(c / NICKEL).append(" ");
            c %= NICKEL;
            sb.append(c / PENNY).append("\n");
        }

        System.out.println(sb);
    }
}