package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingTryCatch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int c = x / y;
            System.out.println(c);
        }catch (InputMismatchException e) {
            System.out.println("java.util.InputMismatchException");
        }catch (Exception e) {
            System.out.println(e);
        }
    }
}
