package CollectionFramework;

import java.util.Scanner;
import java.util.Stack;

public class StackClass {

    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {

            String input = sc.nextLine();
            Stack<Character> stack = new Stack<>();
            for(char c : input.toCharArray()) {
                if(c == '{' || c == '(' || c == '[') {
                    stack.push(c);
                    continue;
                }
                if(c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                    stack.pop();
                    continue;
                }
                if(c == ')' && !stack.isEmpty() && stack.peek() == '('){
                    stack.pop();
                    continue;
                }
                if(c == ']' && !stack.isEmpty() && stack.peek() == '['){
                    stack.pop();
                    continue;
                }
                if(c == '}' || c == ')' || c == ']') {
                    stack.push(c);
                    break;
                }
            }
            System.out.println(stack.isEmpty());
        }

    }
}
