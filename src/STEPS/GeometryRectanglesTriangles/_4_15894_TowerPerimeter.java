package STEPS.GeometryRectanglesTriangles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _4_15894_TowerPerimeter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());

        System.out.println(4 * n);
    }
}