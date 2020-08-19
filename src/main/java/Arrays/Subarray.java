package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Subarray {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] A = new int[n];

        for(int i =0; i < A.length; i++){
            A[i] = scan.nextInt();
        }
        scan.close();

        int count = 0;
        for(int i = 0; i < A.length; i++){
            int sum = 0;
            for(int j = i; j < A.length; j++){
                    sum += A[j];
                    if(sum < 0){
                        count++;
                    }
                }
        }
        System.out.println(count);
    }
}
