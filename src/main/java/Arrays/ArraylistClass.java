package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArraylistClass {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        ArrayList<ArrayList<String>> inList = new ArrayList<ArrayList<String>>();

        for (int i = 0; i < n; i++){
            String s = scan.nextLine();
            inList.add(i, new ArrayList<String>(Arrays.asList(s.split(" "))));
        }

        int m = Integer.parseInt(scan.nextLine());

        for(int i = 0; i < m; i++){
            int x = scan.nextInt();
            int y = scan.nextInt();

            if(x <= inList.size() && y < inList.get(x-1).size() && y > 0 && x > 0){
                System.out.println(inList.get(x-1).get(y));
            } else System.out.println("ERROR!");
        }


    }
}
