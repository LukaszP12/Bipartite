import javafx.print.Collation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Stack;

public class StackDemo {
    public static void main(String args[]){
        //Creating an empty stack
        Stack<Integer> stack = new Stack<Integer>();

        // Use add() to method
        // to add elements in the stack
        stack.add(10);
        stack.add(20);
        stack.add(30);
        stack.add(40);
        stack.add(50);

        // A collection is created
        Collection<Integer> c = new ArrayList<Integer>();
        c.add(1);
        c.add(2);
        c.add(3);

        //Displaying the stack
        System.out.println("The content of the stack is " + stack);

        //Appending the collection to the stack
        stack.addAll(2,c);

        // Clearing the Stack using clear() and displaying
        System.out.println("The new stack is " + stack);

    }

}
