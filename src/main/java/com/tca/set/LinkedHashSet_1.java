package com.tca.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class LinkedHashSet_1 {
    public static void main(String[] args) {

        // Unique value , Order unchanged
        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        lhs.add("Pune");
        lhs.add("Mumbai");
        lhs.add("Delhi");
        lhs.add("Bangalore");
        lhs.add("Pune");
        lhs.add("Mumbai");

        System.out.println(lhs);

        System.out.println("---------------------------");

        for(String data : lhs){
            System.out.println(data);
        }

        System.out.println("---------------------------");

        Iterator ir = lhs.iterator();

        while(ir.hasNext()){
            System.out.println(ir.next());
        }

    }

}
