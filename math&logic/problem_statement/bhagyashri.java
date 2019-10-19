import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the restaurant function below.
     */
    static int restaurant(int l, int b)
     {
        /*
         * Write your code here.
         */
         int c=l;
   
    
        while(c>0)
        {
           if((l%c==0)&&(b%c==0))
           {
               break;
               
           }
        c=c-1;
        }
        int a=(l*b)/(c*c);
        return a;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] lb = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

            int l = Integer.parseInt(lb[0]);

            int b = Integer.parseInt(lb[1]);

            int result = restaurant(l, b);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
