package Сryptographic;

import java.security.MessageDigest;
import java.util.Scanner;

public class SHA256Class {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        try{
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(input.getBytes());
            byte[] hash = messageDigest.digest();

            for(byte b : hash){
                System.out.format("%02x", b);
            }
        }catch (Exception e) {}
    }
}
