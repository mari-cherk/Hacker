package JavaStaticInitializerBlock;

import java.util.Scanner;

public class JavaStaticInitializerBlock {

    static boolean flag = true;
    static int B,H;

    static{
        Scanner scanner = new Scanner(System.in);
        B = Integer.parseInt(scanner.nextLine());
        H = Integer.parseInt(scanner.nextLine());
        scanner.close();

        if(B <= 0 || H <= 0){
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }


    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }
}
