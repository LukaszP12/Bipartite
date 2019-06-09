import java.util.Stack;

public class StackDemo_remove {
    public static void main(String[] args){
        Stack<String> stack = new Stack<String>();

        stack.add("Geeks");
        stack.add("for");
        stack.add("Geeks");
        stack.add("10");
        stack.add("20");

        // Output the stack
        System.out.println("The output of the stack is " + stack);

        // remove an element from the stack
        boolean res = stack.remove("20");

        // Print the removed element
        System.out.println("Was 20 removed ? " + res);

        //Print the final stack
        System.out.println("Final stack" + res);

    }


}
