package com.tca.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_1 {

    public static void main(String[] args) {

        // Unique Value , Order Sorted

        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(34);
        ts.add(67);
        ts.add(22);
        ts.add(99);
        ts.add(23);

        System.out.println(ts);

        System.out.println("---------------------------");

        for(Integer data : ts){
            System.out.println(data);
        }

        System.out.println("---------------------------");

        Iterator ir = ts.iterator();

        while(ir.hasNext()){
            System.out.println(ir.next());
        }
    }
}
