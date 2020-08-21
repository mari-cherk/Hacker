package BigNumber;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

import java.util.Scanner;

public class PrimalityTest {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();
        scanner.close();
        BigInteger bigInt = new BigInteger(n);
        if(bigInt.isProbablePrime(100)){
            System.out.println("prime");
        } else System.out.println("not prime");
    }
}
