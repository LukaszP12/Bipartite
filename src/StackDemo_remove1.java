import java.util.Stack;

public class StackDemo_remove1 {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<Integer>();

        // I am adding elements to the stack
        stack.add(10);
        stack.add(20);
        stack.add(30);
        stack.add(40);
        stack.add(50);

        // Output the stack
        System.out.println("Output" + stack);

        // Remove the elements using remove()
        // Remove can only remove the top element of the stack
        boolean res = stack.remove("100");

        // Print the remove element
        System.out.println("Was 100 succesfully removed " + res);

        // Print the final stack
        System.out.println("Final stack " + stack);
    }

}