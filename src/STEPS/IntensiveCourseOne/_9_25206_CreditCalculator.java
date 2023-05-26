package STEPS.IntensiveCourseOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.StringTokenizer;

public class _9_25206_CreditCalculator {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double creditSum = 0.0;
        double sum = 0.0;
        for(int i = 0 ; i < 20 ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            st.nextToken();
            double credit = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            if(!Objects.equals(grade, "P")) {
                creditSum += credit;
            }

            switch (grade) {
                case "A+":
                    sum += credit * 4.5;
                    break;
                case "A0":
                    sum += credit * 4.0;
                    break;
                case "B+":
                    sum += credit * 3.5;
                    break;
                case "B0":
                    sum += credit * 3.0;
                    break;
                case "C+":
                    sum += credit * 2.5;
                    break;
                case "C0":
                    sum += credit * 2.0;
                    break;
                case "D+":
                    sum += credit * 1.5;
                    break;
                case "D0":
                    sum += credit;
                    break;
                default:
                    break;
            }
        }

        if(sum != 0) {
            System.out.printf("%.6f", sum / creditSum);
        } else {
            System.out.printf("%.6f", sum);
        }
    }
}