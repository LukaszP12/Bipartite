import java.util.ListIterator;
import java.util.Stack;

public class GFG2 {
    public static void main(String args[]){
        Stack<Integer> stack = new Stack<Integer>();

        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(10);
        stack.add(20);

        System.out.println("Stack: " + stack);

        ListIterator<Integer> iterator = stack.listIterator();

        System.out.println("\nUsing ListIterator:\n");
        while(iterator.hasNext()){
            System.out.println("Value is : " + iterator.next());
        }
    }
}
