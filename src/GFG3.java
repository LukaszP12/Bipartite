import java.util.Stack;

public class GFG3 {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<Integer>();

        stack.add(10);
        stack.add(20);
        stack.add(30);
        stack.add(40);

        System.out.println("Stack: " + stack);

        System.out.println("Capacity: " + stack.capacity());

        // Change capacity of the stack
        stack.ensureCapacity(15);

        System.out.println("New capacity of the stack" + stack.capacity());

        stack.trimToSize();

        System.out.println("The current capacity of the stack, after using trimToSize() method" + stack.capacity());

    }


}
