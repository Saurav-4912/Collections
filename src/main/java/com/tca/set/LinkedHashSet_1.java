package com.tca.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class LinkedHashSet_1 {
    public static void main(String[] args) {

        // Unique value , Order unchanged
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        lhs.add(11);
        lhs.add(44);
        lhs.add(22);
        lhs.add(55);
        lhs.add(22);
        lhs.add(11);

        System.out.println(lhs);

        System.out.println("---------------------------");

        for(Integer data : lhs){
            System.out.println(data);
        }

        System.out.println("---------------------------");

        Iterator ir = lhs.iterator();

        while(ir.hasNext()){
            System.out.println(ir.next());
        }

    }

}
