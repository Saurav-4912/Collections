package com.tca.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<String> L = new LinkedList<>();

        L.add("Pune");
        L.add("Mumbai");
        L.add("Delhi");
        L.add("Noida");
        L.add(null);

        System.out.println(L);
        System.out.println("Size of linkedlist : " + L.size());
        System.out.println("--------------------");
        String status = L.get(2);
        System.out.println(status);

        System.out.println("--------------------");



        System.out.println("Traverse LinkedList using ListIterator : ");
        ListIterator<?> lr = L.listIterator();

        System.out.println("Forward : ");

        while(lr.hasNext()){
            System.out.println(lr.next());
        }

        System.out.println("------------");
        System.out.println("Backward : ");

        while(lr.hasPrevious()){
            System.out.println(lr.previous());
        }
    }
}
