import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        sc.close();
        boolean status = true;

        int left = 0;
        int right = A.length() - 1;
        while (left < right) {
            if (A.charAt(left) != A.charAt(right)) {
                status = false;
            }
            left++;
            right--;
        }

        if (status) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

}
