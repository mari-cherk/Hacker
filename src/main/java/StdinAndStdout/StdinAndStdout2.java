package StdinAndStdout;

import java.util.Scanner;

public class StdinAndStdout2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*int i = Integer.parseInt(scan.nextLine());
        double d = Double.parseDouble(scan.nextLine());
        String s = scan.nextLine();*/

        int i = scan.nextInt();
        double d = scan.nextDouble();
        String s = scan.next();
        scan.close();
        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
