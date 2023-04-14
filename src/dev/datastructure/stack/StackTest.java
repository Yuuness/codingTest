package dev.datastructure.stack;

import java.util.Stack;
public class StackTest {
  public static void main(String[] args) {
    Stack<String> stack = new Stack<>();
    stack.push("one");
    stack.push("two");
    stack.push("three");

    System.out.println(stack);
    System.out.println(stack.pop());
    System.out.println(stack);
    System.out.println(stack.size());
    System.out.println(stack.isEmpty());
    System.out.println(stack.peek());
    System.out.println(stack);
  }
}
