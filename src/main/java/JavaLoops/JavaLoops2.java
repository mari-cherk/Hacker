package JavaLoops;

import java.util.Scanner;

public class JavaLoops2 {

    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i=0; i<t; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            if(t >= 0 && t <= 500){
                if((a >= 0 && a <= 50) && (b >= 0 && b <= 50)){
                    if(n >= 1 && n <= 15){
                        int sum = a;
                        for(int j = 0; j < n; j++){
                            int s = (int) (Math.pow(2,j) * b);

                            sum += s;
                            System.out.print(sum + " ");
                        }
                        System.out.println();
                    }
                }
            }
        }
        in.close();
    }
}
