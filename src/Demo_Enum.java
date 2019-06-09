import java.util.Enumeration;
import java.util.Stack;

public class Demo_Enum {
    public static void main(String[] args){
        Stack<String> stack = new Stack<String>();

        stack.add("Geeks");
        stack.add("4");
        stack.add("Geeks");
        stack.add("Welcomes");
        stack.add("You");

        System.out.println("Stack:" + stack);

        Enumeration enu = stack.elements();

        System.out.println("The enumeration of values are: ");

        //Displaying the enumerations of values
        while (enu.hasMoreElements()){
            System.out.println(enu.nextElement());
        }

     Stack<Integer> stack1 = new Stack<Integer>();

        stack1.add(10);
        stack1.add(15);
        stack1.add(20);
        stack1.add(25);
        stack1.add(30);

        System.out.println("Stack1: " + stack1);

        Enumeration enu1 = stack1.elements();

        System.out.println("The values of the second enumeration are: ");

        while (enu1.hasMoreElements()){
            System.out.println(enu1.nextElement());
        }

    }

}