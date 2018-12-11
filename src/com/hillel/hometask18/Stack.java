package com.hillel.hometask18;

public class Stack {

    private final int MAX;
    private char[] stackArray;
    private int pointer = 0;

    public Stack(int capacity) {
        this.MAX = capacity;
        stackArray = new char[MAX];
    }

    public void push(char d) {
        if (pointer == MAX) {
            System.out.println("The stack is full");
            return;
        }
        stackArray[pointer] = d;
        pointer++;
    }

    public char pull() {
        if (pointer == 0) {
            System.out.println("The stack is empty");
            return 0;
        }
        pointer--;
        char d = stackArray[pointer];
        return d;
    }

    public char peek() {
        if (pointer == 0) {
            System.out.println("Can't pop an element since the stack is empty");
            return 0;
        }
        return stackArray[pointer - 1];
    }

    public void checkExpression(String str) {

        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '[' || arr[i] == '{' || arr[i] == '(')
                push(arr[i]);
            else if (arr[i] == '}' && peek() == '{')
                pull();
            else if (arr[i] == ']' && peek() == '[')
                pull();
            else if (arr[i] == ')' && peek() == '(')
                pull();
        }
        if (isEmpty()) {
            System.out.println("String is balanced");
        } else {
            System.out.println("String is not balanced");
        }
    }

    public boolean isEmpty() {
        return (pointer == 0);
    }


    public static void main(String[] args) {
        String s1 = "([]){()}";
        String s2 = "({){[]}";

        char[] arr1 = s1.toCharArray();
        Stack stack = new Stack(arr1.length);
        System.out.println("s1:");
        stack.checkExpression(s1);

        char[] arr2 = s2.toCharArray();
        Stack stack1 = new Stack(arr2.length);
        System.out.println("s2:");
        stack1.checkExpression(s2);
    }

}

