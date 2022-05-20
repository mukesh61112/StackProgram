package com.company;
class Stack{
    static final int MAX=100;
    int top;
    int a[]=new int[MAX];

    boolean isEmpty()
    {
        return (top<0);
    }
    Stack(){
        top=-1;
    }
    boolean push(int x)
    {
        if(top>=(MAX-1))
        {
            System.out.println(" stack is overflow");
            return false;
        }
        else{
            a[++top]=x;
            System.out.println(x +" ele push in stack");
            return true;
        }
    }
    int  pop()
    {
        if(top<0)
        {
            System.out.println(" stack is underflow");
            return  0;
        }
        else {
            return a[top--];
        }
    }
    int peek()
    {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            int x = a[top];
            return x;
        }
    }

    void print() {
        for (int i = top; i > -1; i--) {
            System.out.print(" " + a[i]);
        }
    }

}
public class Stack_UsingArray {
    public static void main(String [] args)
    {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
        System.out.println("Top element is :" + s.peek());
        System.out.print("Elements present in stack :");
        s.print();
    }
}
