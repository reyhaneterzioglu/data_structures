import java.util.Deque;
import java.util.LinkedList;

public class CollectionStack {

    public static void main(String[] args) {

        // doubly linked list
        Deque<Integer> cStack = new LinkedList<>();

        cStack.push(1);
        cStack.push(2);
        cStack.push(3);

        System.out.println(cStack.peek()); // 3
        System.out.println(cStack.pop()); // 3
        System.out.println("peek is "+cStack.peek()); // 2



    }
}
