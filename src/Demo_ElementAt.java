import java.util.Stack;

public class Demo_ElementAt {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<String>();

        stack.add("Geeks");
        stack.add("for");
        stack.add("Geeks");
        stack.add("10");
        stack.add("20");

        System.out.println("Stack: " + stack);

        System.out.println("The element at pos[3] is " + stack.elementAt(3));

        //adding an element to the stack
        stack.insertElementAt("are", 1);

        System.out.println("After adding: ");
        //Now we are displaying the new elements
        for (String str : stack) {
            System.out.println(str);
        }

        Stack<Integer> stack1 = new Stack<Integer>();

        stack1.add(10);
        stack1.add(20);
        stack1.add(30);
        stack1.add(40);
        stack1.add(50);

        //Displaying the output
        System.out.println("Stack: " + stack1);

        //inserting element at 1st position
        stack1.insertElementAt(100, 0);

        //inserting element at 4th position
        stack1.insertElementAt(200, 4);

        System.out.println("The final stack is: " + stack1);


        //Checking if both stacks contain the same elements
        System.out.println("\nDoes stack contain the same elements as stack1 ? " + stack.containsAll(stack1));


        Stack<Integer> stack3 = new Stack<Integer>();
            stack3.add(10);
            stack3.add(20);
            stack3.add(30);
            stack3.add(40);
            stack3.add(50);

        //checking if stack are the same
        System.out.println("\nDoes stack contain the same elements as stack3 ? " + stack1.containsAll(stack3));


    }
}