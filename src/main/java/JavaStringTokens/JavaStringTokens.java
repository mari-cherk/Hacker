package JavaStringTokens;

import java.util.Arrays;
import java.util.Scanner;

public class JavaStringTokens {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine().trim();

        // Write your code here.

        if(s.length() > 0 && s.length() <= 400000){
            String[] tokens = s.split("[ .!,?._'@]+");
            System.out.println(tokens.length);
            Arrays.stream(tokens).forEach(System.out::println);
        } else {
            System.out.println(0);
        }

        scan.close();
    }
}
