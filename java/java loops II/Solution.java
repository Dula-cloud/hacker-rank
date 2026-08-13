import java.util.*;
import java.io.*;

class Solution {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            double loopSec = 0;
            int fullLoop = 0;
            for (int x = 0; x < n; x++) {

                double power = Math.pow(2, x);
                loopSec = power * b;
                fullLoop += (int) loopSec;
                int result = fullLoop + a;
                System.out.print(result+" ");
            }
            System.out.println();
        }
        in.close();
    }
}