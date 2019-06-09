// Java program to demonstrate
// listIterator() method
// for String value

import java.util.ListIterator;
import java.util.Stack;

public class GFG1 {
    public static void main(String[] args) throws Exception {
        try {

            // Creating object of Stack<Integer>
            Stack<String> stack = new Stack<String>();

            stack.add("A");
            stack.add("B");
            stack.add("C");
            stack.add("D");

            System.out.println("Stack: " + stack);

            // Creating object of ListIterator<String>
            // using listIterator() method
            ListIterator<String> iterator = stack.listIterator();

            // Printing the iterated value
            System.out.println("\nUsing ListIterator:\n");
            while (iterator.hasNext()) {
                System.out.println("Value is : " + iterator.next());
            }
        }

        catch (NullPointerException e) {
            System.out.println("Exception throw : " + e);
        }
    }
}