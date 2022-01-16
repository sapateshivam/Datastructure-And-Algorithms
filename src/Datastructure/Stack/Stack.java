package Datastructure.Stack;

public class Stack {
    private static int top = -1;
    private static int stack[] = new int[5];

    public static void push(int num) {
        if (top == 4) {
            System.out.println("Stack is empty");
        } else {
            top++;
            stack[top] = num;
        }
    }

    public static void pop() {
        if (top == 0) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("deleted element in stack is :"+stack[top]);
            top--;
        }
    }

    public static void display() {
        if (top == 0) {
            System.out.println("Stack is empty");
        } else {
            for (int i = 0; i <= top; i++) {
                System.out.println(stack[i] + " ");
            }
        }
    }

    public static void main(String args[]) {
        push(10);
        push(20);
        push(30);
        pop();
        display();
    }
}
