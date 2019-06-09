import java.util.Stack;

public class collection {
    public static void main(String[] args){
        Stack<String> stack = new Stack<String>();

        stack.add("Welcome");
        stack.add("To");
        stack.add("Geeks");
        stack.add("For");
        stack.add("Geeks");


        System.out.println("Stack: " + stack);

        // printing out the current capacity of the stack
        System.out.println("Current capacity of the stack: " + stack.capacity());

        // Change capacity to 20
        stack.ensureCapacity(20);

        System.out.println("Current capacity is: " + stack.capacity());

        stack.trimToSize();

        System.out.println("Current capacity of the stack, after using the trimToSize() method" + stack.capacity());

    }
}
