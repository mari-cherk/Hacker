package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ListClass {

    public static void main(String[] args) {

        /*Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        List<Integer> list = new ArrayList<Integer>();
        //LinkedList<Integer> list = new LinkedList<>();

        for(int i = 0; i < N; i++){
            list.add(scanner.nextInt());
        }

        //int Q = Integer.parseInt(scanner.nextLine());
        int Q = scanner.nextInt();

        for(int i = 0; i < Q; i++)
        {
            System.out.println(i);
            String S = scanner.nextLine();
            if(S.equals("Insert")){
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                list.add(x, y);
            } else if(S.equals("Delete")){
                int x = scanner.nextInt();
                list.remove(x);
            }
        }
        list.stream().forEach(x -> System.out.print(x + " "));*/

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < N; i++) {
            int value = scan.nextInt();
            list.add(value);
        }

        int Q = scan.nextInt();
        for (int i = 0; i < Q; i++) {
            String S = scan.next();
            if (S.equals("Insert")) {
                int index = scan.nextInt();
                int value = scan.nextInt();
                list.add(index, value);
            } else if(S.equals("Delete")) { // "Delete"
                int index = scan.nextInt();
                list.remove(index);
            }
        }
        scan.close();

        list.stream().forEach(x -> System.out.print(x + " "));
    }
}
