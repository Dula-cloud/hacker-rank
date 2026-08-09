import java.util.HashMap;
import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {

        //Method without hashmap and vanilla for loops

        a = a.replaceAll("\\s", "").toLowerCase();
        b = b.replaceAll("\\s", "").toLowerCase();

        if (a.length() != b.length()) {
            return false;
        }

        StringBuilder sb = new StringBuilder(b);

        for (int i = 0; i < a.length(); i++) {
            char currentChar = a.charAt(i);
            boolean found = false;
            for (int j = 0; j < sb.length(); j++) {
                if (sb.charAt(j) == currentChar) {
                    sb.deleteCharAt(j);
                    found = true;
                    break;
                }
            }
            if (!found) {
                return false;
            }
        }
        return sb.length() == 0;

        // Method with HashMap********8

        // if (a.length() != b.length()) {
        // return false;
        // }

        // HashMap<Character, Integer> charCount = new HashMap<>();

        // for (char c : a.toCharArray()) {
        // charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        // }

        // for (char c : b.toCharArray()) {
        // if(!charCount.containsKey(c)){
        // return false;
        // }
        // charCount.put(c,charCount.get(c)-1);
        // if(charCount.get(c) == 0){
        // return false;
        // }
        // }

        // return charCount.isEmpty();

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
