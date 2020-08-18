package JavaString;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if(a.length() != b.length()){
            return false;
        }

        /*char[] stringA = a.toLowerCase().toCharArray();
        char[] stringB = b.toLowerCase().toCharArray();


        Arrays.sort(stringA);
        Arrays.sort(stringB);

        if(Arrays.equals(stringA, stringB)){
            return true;
        } else return false;*/


        a = a.toLowerCase();
        b = b.toLowerCase();

        int count = 0;
        for(char x = 'a'; x <= 'z'; x++ ){
            for(int i =0; i < a.length(); i++){
                if(a.charAt(i) == x){
                    count++;
                }
                if(b.charAt(i) == x){
                    count--;
                }
            }
            if(count != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
