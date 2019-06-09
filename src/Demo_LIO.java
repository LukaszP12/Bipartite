import java.util.Stack;

public class Demo_LIO {
    public static void main(String args[]) {
        Stack<String> stack = new Stack<String>();

        stack.add("Geeks");
        stack.add("for");
        stack.add("Geeks");
        stack.add("10");
        stack.add("Geeks");

        System.out.println("Stack: " + stack);

        // The first position of an element
        // is returned
        System.out.println("The first occurance of Geeks is at last index: " + stack.indexOf("Geeks"));

        // Get the last occurrence of Geeks
        // using lastIndexOf() method
        System.out.println("The last occurrence"
                + " of Geeks is at last index: "
                + stack.lastIndexOf("Geeks", stack.lastIndexOf("Geeks")));

        //Looking from 2. index
        System.out.println("The looking from the second index: " + stack.lastIndexOf("Geeks", 3));

        //Looking again
        System.out.println("The looking from lastIndex - 1"
                + " of the Stack "
                + stack.lastIndexOf("Geeks", stack.lastIndexOf("Geeks")-1)
                    );


    }
}
