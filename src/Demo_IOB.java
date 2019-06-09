import java.util.Stack;

public class Demo_IOB {
     public static void main(String[] args) {
         Stack<Integer> stack = new Stack<Integer>();

         stack.add(1);
         stack.add(2);
         stack.add(3);
         stack.add(10);
         stack.add(20);

         System.out.println("Stack: " + stack);

         // Get the 10th occurrence of Geeks
         // using lastIndexOf() method
         System.out.println("The 10nth ocurrance  "
                 + "of Geeks is at index: ");

            try{
                System.out.println(stack.lastIndexOf("Geeks",10));
            }catch (Exception e){
                System.out.println(e);
            }


    }
}