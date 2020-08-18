package JavaString;

import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */

        /*String helper = "";

        for(int i = A.length()-1; i >= 0; i--){
            helper = helper + A.charAt(i);
        }
        if(A.equals(helper)){
            System.out.println("Yes");
        } else System.out.println("No");*/

        System.out.println( A.equalsIgnoreCase(new StringBuilder(A).reverse().toString() )
                ? "Yes" : "No" );
    }
}
