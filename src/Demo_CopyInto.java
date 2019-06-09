import java.util.Stack;

public class Demo_CopyInto {
    public static void main(String[] args){
        Stack<String> stack = new Stack<String>();

        stack.add("Welcome");
        stack.add("To");
        stack.add("Geeks");
        stack.add("4");
        stack.add("Geeks");

        System.out.println("Stack:" + stack);

        // Creating a stack
        String arr[] = new String[6];

        arr[0] = "Hello";
        arr[1] = "World";

        //Dislaying the intial stack
        System.out.println("The initial stack is: ");
        for(String str : arr){
            System.out.println(str);
        }

        //Copying
        stack.copyInto(arr);

        //Final Stack
        System.out.println("The final stack is: ");
        for(String str : arr){
            System.out.println(str);
        }

        Stack<Integer> stack1 = new Stack<Integer>();

        stack1.add(10);
        stack1.add(20);
        stack1.add(30);
        stack1.add(40);
        stack1.add(50);

        System.out.println("Displaying the stack" + stack1);

        //Creating a stack
        Integer arr1[] = new Integer[6];

        arr1[0] = 50;
        arr1[1] = 60;
        arr1[2] = 70;
        arr1[3] = 80;
        arr1[4] = 90;

        System.out.println("The initial stack is;  ");
        for (Integer str : arr1){
            System.out.println(str);
        }

        //Copying
        stack1.copyInto(arr1);

        // The final stack
        System.out.println("The final stack is: ");
        for(Integer str : arr1){
            System.out.println(str);
        }

    }
}