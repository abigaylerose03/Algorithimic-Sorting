import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String currStr = s.substring(0, k);
        String lexMin = currStr;
        String lexMax = currStr;
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
      for(int i = k; i < s.length(); i++) {
             currStr = currStr.substring(1, k) + s.charAt(i); 
            if (lexMax.compareTo(currStr) < 0)      
                 lexMax = currStr; 
            if (lexMin.compareTo(currStr) > 0) 
                 lexMin = currStr;             
  
        }
        return lexMin + "\n" + lexMax;
    }




    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
