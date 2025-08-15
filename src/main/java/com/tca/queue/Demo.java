package com.tca.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Demo {
    public static void main(String[] args) {

        Queue<Number> queue = new LinkedList<>();

        queue.add(11);
        queue.add(33);
        queue.add(99);
        queue.add(77);

        System.out.println(queue);

        System.out.println("SIZE : " + queue.size());

        System.out.println("REMOVE : " + queue.remove());

        System.out.println(queue);

    }
}
