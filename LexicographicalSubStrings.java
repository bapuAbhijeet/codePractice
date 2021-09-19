import java.util.Scanner;

public class LexicographicalSubStrings {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        String curr = s.substring(0,k);
        smallest = curr;
        largest = curr;
        
        for (int i = k; i < s.length();i ++)
        {
            curr = curr.substring (1,k) + s.charAt(i);
            System.out.println(curr);
            if(largest.compareTo(curr) < 0)
                largest  = curr;
            if(smallest.compareTo(curr) > 0)
                smallest = curr;
        }
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        String s = "welcometojava";
        int k = 3;
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}