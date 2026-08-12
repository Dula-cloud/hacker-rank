import java.util.Scanner;
import java.util.regex.*;

public class Solution
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String pattern = in.nextLine();

            if(isValidPatter(pattern)){
                System.out.println("Valid");
            }else{
                System.out.println("Invalid");
            }
          	
            

		}
	}

    public static boolean isValidPatter(String pattern){
        try {
            Pattern.compile(pattern);
            return true;
        } catch (Exception e) {
            // TODO: handle exception
            return false;
        }
    }



}



