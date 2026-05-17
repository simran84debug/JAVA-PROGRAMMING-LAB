import java.util.ArrayDeque;
import java.util.Deque;

public class S1P10 {

    // Create Deque
    private Deque<Integer> stack = new ArrayDeque<>();

    // Push element onto stack
    public void push(int x) {
        stack.push(x);
    }

    public static void main(String[] args) {

        S1P10 s = new S1P10();

        // Push elements
        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("Stack after pushes: " + s.stack);
    }
}