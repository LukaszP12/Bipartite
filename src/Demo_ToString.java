import java.util.Stack;

public class Demo_ToString {
   public static void main(String args[]){
       Stack<String> stack = new Stack<String>();

       stack.add("Welcome");
       stack.add("To");
       stack.add("Geeks");
       stack.add("For");
       stack.add("Geeks");

       System.out.println(stack.toString());

       Stack<Integer> stack1 = new Stack<Integer>();

       stack1.add(10);
       stack1.add(20);
       stack1.add(30);
       stack1.add(40);

       System.out.println(stack1.toString());

   }


    }