import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        String[] words = s.split("[^A-Za-z]+");

        int count = 0;

        for (String word : words) {
            if (!word.isEmpty()) {
                count++;
            }
        }
        System.out.println(count);

        for (String word : words) {
            if (!word.isEmpty()) {
                System.out.println(word);
            }
        }

        scan.close();
    }
}
