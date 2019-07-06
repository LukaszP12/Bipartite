import java.util.ArrayList;
import java.util.Collection;
import java.util.Stack;

public class GFG {
    public static void main(String[] args){
        // Creating an empty stack
        Stack stack = new Stack<String>();

        //Use add() method to add elements in the Stack
        stack.add("Geeks");
        stack.add("for");
        stack.add("Geeks");
        stack.add("10");
        stack.add("20");

        // A collection is created
        Collection<String> c = new ArrayList<String>();
            c.add("A");
            c.add("Computer");
            c.add("Portal");
            c.add("for");
            c.add("Geeks");

            // Displaying the stack
        System.out.println("The stack is: " + stack);

            // Appending the collection to the stack
        stack.addAll(1,c);

        // Clearing the Stack using clear() and displaying
        System.out.println("The new stack is: " + stack);

    }

}
