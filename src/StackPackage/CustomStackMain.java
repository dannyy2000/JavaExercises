package StackPackage;

public class CustomStackMain {
    public static void main(String[] args) throws StackException {

//        CustomStack stack = new CustomStack(5);

        CustomStack stack = new DynamicStack(5);

        stack.push(25);
        stack.push(10);
        stack.push(20);
        stack.push(50);
        stack.push(29);
        stack.push(90);


        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
       System.out.println(stack.pop());

//        System.out.println(stack.peek());
//        System.out.println(stack.peek());
//        System.out.println(stack.peek());

    }





}
