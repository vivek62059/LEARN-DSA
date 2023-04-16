import java.util.Queue;
import java.util.*;
public class Queuebasics {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        queue.add(5);
        queue.add(9);
        queue.add(7);
        queue.add(8);
        System.out.println(queue.peek());
        System.out.println(queue.remove());
    }
    
}
