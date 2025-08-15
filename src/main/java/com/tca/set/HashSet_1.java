package com.tca.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_1 {
    public static void main(String[] args) {


        // Unique Value , Order Changed
        HashSet<Integer> hs = new HashSet<>();

        hs.add(11);
        hs.add(56);
        hs.add(75);
        hs.add(32);
        hs.add(89);

        System.out.println(hs);

        for(Integer data : hs){
            System.out.println(data);
        }

        System.out.println("-----------------------");

        Iterator ir = hs.iterator();

        while(ir.hasNext()){
            System.out.println(ir.next());
        }
    }
}
