import java.util.Stack;

/**
 * Created by yang on 2019/4/15.
 */
public class App {

    public static void main(String[] args) {
      
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);


        System.out.println(stack.pop());

    }
}
