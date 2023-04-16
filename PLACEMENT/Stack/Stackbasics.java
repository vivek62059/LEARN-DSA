import java.util.Stack;
public class Stackbasics{
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(34);
        stack.push(2);
        stack.push(19);
        stack.push(25);
        stack.push(45);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}