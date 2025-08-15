package com.tca.stack;
import java.util.*;

public class Demo {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.add("Pune");
        stack.add("Mumbai");
        stack.add("Delhi");
        stack.add("Bangalore");

        System.out.println(stack);

        System.out.println("PEEK : " + stack.peek());

        System.out.println("SIZE : " + stack.size());

        System.out.println("POP : " + stack.pop());
        System.out.println("POP : " + stack.pop());
        System.out.println("POP : " + stack.pop());
        System.out.println("POP : " + stack.pop());

        System.out.println(stack);

        System.out.println("SIZE : " + stack.size());



    }
}
