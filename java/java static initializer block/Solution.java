import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int a =in.nextInt();
        int b = in.nextInt();


        if(a > 0 && b > 0){
            System.out.println(a * b);
        }else{
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }



    }
}