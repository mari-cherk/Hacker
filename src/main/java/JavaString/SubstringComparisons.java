package JavaString;

import java.util.Scanner;

public class SubstringComparisons {

    public static String getSmallestAndLargest(String s, int k) {

        String smallest = "";
        String largest = "";
        if(s.length() >= k) {
            smallest = s.substring(0, k);
            largest = s.substring(0, k);

            for(int i = 0; i <= s.length() - k; i++){
                String newS = s.substring(i, i + k);
                if (smallest.compareTo(newS) < 0){
                    smallest = newS;
                } else if(largest.compareTo(newS) > 0){
                    largest = newS;
                }
            }

        }

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'



        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
