package _1week;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Print1000 {

   public static void main(String[] args) throws NumberFormatException, IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      /*
       * BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       */
      
      String str = br.readLine();
      
      int A = Integer.parseInt(str.split(" ")[0]);
      int B = Integer.parseInt(str.split(" ")[1]);
      
      System.out.println(A + B);
      
      /*
       * bw.write(A + B + "\n");
       * 
       * 
       * bw.flush(); bw.close(); br.close();
       */
   }

}